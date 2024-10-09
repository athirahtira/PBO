public class Player
{
    private String name;
    private int baseHealth;
    private int baseAttack;
    private int incrementHealth;
    private int incrementAttack;
    private int level;
    private int totalDamage;
    private boolean isAlive;
    private Armor armor;
    private Weapon weapon;

    public Player(String name)
    {
        this.name = name;
        this.baseHealth = 100;
        this.baseAttack = 100;
        this.level = 1;
        this.incrementHealth = 20;
        this.incrementAttack = 20;
        this.isAlive = true;
        this.armor = null;
        this.weapon = null;
    }

    public void display()
    {
        System.out.println("Name: " + name);
        System.out.println("Level: " + level);
        System.out.println("Health: " + maxHealth());
        System.out.println("Attack: " + getAttack());
        System.out.println("Armor: " + (armor != null ? armor.getName() : "None"));
        System.out.println("Weapon: " + (weapon != null ? weapon.getName() : "None"));
    }

    public int maxHealth()
    {
        return baseHealth + level * incrementHealth + (armor != null ? armor.getAddHealth() : 0);
    }

    public int getAttack()
    {
        return baseAttack + level * incrementAttack + (weapon != null ? weapon.getAttack() : 0);
    }

    public void attack(Player target)
    {
        if (!target.isAlive())
            return;

        int damage = getAttack() - target.defence();
        if (damage > 0)
        {
            target.takeDamage(damage);
            levelUp();
        }
    }

    public int defence()
    {
        return (armor != null ? armor.getDefencePower() : 0);
    }

    public void takeDamage(int damage)
    {
        int deltaDamage = damage - defence();
        if (deltaDamage > 0)
        {
            totalDamage += deltaDamage;
            if (maxHealth() <= 0)
            {
                isAlive = false;
                totalDamage = maxHealth();
            }
        }
    }

    private void levelUp()
    {
        level++;
    }

    public boolean isAlive()
    {
        return isAlive;
    }

    public void equipArmor(Armor armor)
    {
        this.armor = armor;
    }

    public void equipWeapon(Weapon weapon)
    {
        this.weapon = weapon;
    }
}
