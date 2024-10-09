import java.util.ArrayList;

class Player
{
    private static int numberOfPlayer;
    private static ArrayList<String> nameList = new ArrayList<>();
    private String name;
    Player(String name)
    {
        this.name = name;
        Player.numberOfPlayer++;
        Player.nameList.add(this.name);
    }

    void show()
    {
        System.out.println("Player name: " + this.name);
    }

    static void showNumberOfPlayer()
    {
        System.out.println("Number of Player: " + Player.numberOfPlayer);
    }
    static ArrayList<String> getNames()
    {
        return Player.nameList;
    }
}

class StaticMethod
{
    public static void main(String[] args)
    {
        Player player1 = new Player("Athirah");
        Player player2 = new Player("Harihta");
        Player player3 = new Player("Adihsar");
        Player player4 = new Player("Amian");

        Player.showNumberOfPlayer();

        System.out.println("Names = " + Player.getNames());
    }
}
