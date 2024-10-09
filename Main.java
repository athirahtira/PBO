public class Main
{
    public static void main(String[] args)
    {
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");
        Armor armor1 = new Armor("Armor 1", 5, 20);
        Armor armor2 = new Armor("Armor 2", 3, 15);
        Weapon weapon1 = new Weapon("Weapon 1", 30);
        Weapon weapon2 = new Weapon("Weapon 2", 25);

        player1.equipArmor(armor1);
        player1.equipWeapon(weapon1);
        player2.equipArmor(armor2);
        player2.equipWeapon(weapon2);

        System.out.println("Status awal:");
        player1.display();
        System.out.println();
        player2.display();
        System.out.println();

        player1.attack(player2);
        System.out.println("Player 1 menyerang Player 2:");
        player1.display();
        System.out.println();
        player2.display();
        System.out.println();

        player2.attack(player1);
        System.out.println("Player 2 menyerang Player 1:");
        player1.display();
        System.out.println();
        player2.display();
        System.out.println();

        player2.attack(player1);
        System.out.println("Player 2 menyerang Player 1 lagi:");
        player1.display();
        System.out.println();
        player2.display();
        System.out.println();
    }
}
