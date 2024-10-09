import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

class Game
{
    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();
    
    private static String[][] map =
    {
        {" . ", " . ", " . ", " . ", " . ", " . ", " . ", " # ", " . ", " . "},
        {" # ", " # ", " # ", " . ", " # ", " # ", " . ", " # ", " . ", " . "},
        {" # ", " . ", " . ", " # ", " . ", " . ", " . ", " . ", " . ", " # "},
        {" # ", " . ", " . ", " . ", " # ", " . ", " # ", " . ", " . ", " . "},
        {" . ", " # ", " . ", " # ", " # ", " . ", " # ", " # ", " # ", " . "},
        {" # ", " . ", " . ", " . ", " # ", " . ", " . ", " . ", " . ", " # "},
        {" . ", " . ", " # ", " . ", " # ", " # ", " # ", " # ", " . ", " # "},
        {" # ", " . ", " # ", " . ", " . ", " . ", " . ", " # ", " . ", " . "},
        {" . ", " . ", " . ", " # ", " # ", " . ", " . ", " . ", " # ", " . "},
        {" F ", " # ", " . ", " . ", " . ", " . ", " # ", " . ", " . ", " . "}
    };

    private static int playerX = 0;
    private static int playerY = 0;
    private static int playerLives = 5;

    private static ArrayList<int[]> ghostPositions = new ArrayList<>();
    private static String[] items = {"Coin", "Cherry", "Strawberry"};
    private static Map<String, Integer> itemHistory = new HashMap<>();
    private static Map<String, Integer> enemyHistory = new HashMap<>();

    private static void placeGhosts()
    {
        int ghostCount = 3;
        while (ghostCount > 0)
        {
            int x = random.nextInt(map.length);
            int y = random.nextInt(map[0].length);
            if (map[x][y].equals(" . ") && !(x == playerX && y == playerY))
            {
                map[x][y] = " G ";
                ghostPositions.add(new int[]{x, y});
                ghostCount--;
            }
        }
    }

    private static void moveGhosts()
    {
        for (int[] ghostPosition : ghostPositions)
        {
            int ghostX = ghostPosition[0];
            int ghostY = ghostPosition[1];
            map[ghostX][ghostY] = " . ";

            int newGhostX = ghostX;
            int newGhostY = ghostY;

            while (true)
            {
                int direction = random.nextInt(4);
                int dx = 0, dy = 0;
                switch (direction)
                {
                    case 0: dx = -1; break; //w
                    case 1: dx = 1; break; //s
                    case 2: dy = -1; break; //a
                    case 3: dy = 1; break; //d
                }
                newGhostX = ghostX + dx;
                newGhostY = ghostY + dy;

                if (newGhostX >= 0 && newGhostX < map.length &&
                    newGhostY >= 0 && newGhostY < map[0].length &&
                    !map[newGhostX][newGhostY].equals(" # ") &&
                    !map[newGhostX][newGhostY].equals(" F "))
                    {
                    break;
                }
            }

            ghostPosition[0] = newGhostX;
            ghostPosition[1] = newGhostY;
            map[newGhostX][newGhostY] = " G ";
        }
    }

    public static void start()
    {
        System.out.println("\nWelcome to the Pac-Man Game");
        String username = prompt("Username: ");

        playerX = 0;
        playerY = 0;
        playerLives = 5;
        ghostPositions.clear();
        itemHistory.clear();
        enemyHistory.clear();

        placeGhosts();
        System.out.println("Welcome " + username + "! Let's start it!");

        System.out.println("Your total points: " + User.getUserPoints(username));

        boolean playing = true;
        boolean won = false;
        while (playing && playerLives > 0)
        {
            printMap();
            System.out.println("Lives remaining: " + playerLives);
            String action = prompt("\nMove (w/a/s/d) or type 'exit' to quit: ");
            switch (action.toLowerCase())
            {
                case "w":
                    move(-1, 0);
                    break;
                case "a":
                    move(0, -1);
                    break;
                case "s":
                    move(1, 0);
                    break;
                case "d":
                    move(0, 1);
                    break;
                case "exit":
                    playing = false;
                    System.out.println("Exiting the game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid action. Please try again.");
            }

            moveGhosts();

            if (map[playerX][playerY].equals(" F "))
            {
                playing = false;
                won = true;
                System.out.println("Congratulations! You have reached the finish line.");
                System.out.println("Items collected:");
                printItemHistory();
                System.out.println("Encounters with enemies:");
                printEnemyHistory();
                System.out.println();
            }
        }

        if (playerLives <= 0)
        {
            System.out.println("Game over! You have lost all your lives.");
            System.out.println("Items collected:");
            printItemHistory();
            System.out.println("Encounters with enemies:");
            printEnemyHistory();
            System.out.println();
        }
        if (won)
        {
            User.updateUserPoints(username, 10);
        }
        else
        {
            User.updateUserPoints(username, calculatePoints());
        }
    }

    private static int calculatePoints()
    {
        int points = 0;
        for (Map.Entry<String, Integer> entry : itemHistory.entrySet())
        {
            points += entry.getValue();
        }
        for (Map.Entry<String, Integer> entry : enemyHistory.entrySet())
        {
            points -= entry.getValue();
        }
        return points;
    }

    private static void move(int dx, int dy)
    {
        int newX = playerX + dx;
        int newY = playerY + dy;

        if (!map[newX][newY].equals(" # "))
        {
            playerX = newX;
            playerY = newY;
            encounter();
        }
        else
        {
            System.out.println("You hit a wall!");
        }
    }

    private static void encounter()
    {
        if (map[playerX][playerY].equals(" G "))
        {
            System.out.println("You encountered a Ghost! You lose 1 life.");
            playerLives--;
            map[playerX][playerY] = " . "; // remove the ghost after encounter
            enemyHistory.put("Ghost", enemyHistory.getOrDefault("Ghost", 0) + 1);
        }
        else
        {
            int event = random.nextInt(3);
            switch (event)
            {
                case 0:
                    String item = items[random.nextInt(items.length)];
                    System.out.println("You found a " + item + "!");
                    itemHistory.put(item, itemHistory.getOrDefault(item, 0) + 1);
                    break;
                case 1:
                    System.out.println("You found nothing. Keep moving.");
                    break;
            }
        }
    }

    private static void printMap()
    {
        for (int i = 0; i < map.length; i++)
        {
            for (int j = 0; j < map[i].length; j++)
            {
                if (i == playerX && j == playerY)
                {
                    System.out.print(" P ");
                }
                else
                {
                    System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
    }

    private static String prompt(String message)
    {
        System.out.print(message);
        return scanner.nextLine();
    }

    private static void printItemHistory()
    {
        for (Map.Entry<String, Integer> entry : itemHistory.entrySet())
        {
            System.out.println(entry.getKey() + " x" + entry.getValue());
        }
    }

    private static void printEnemyHistory()
    {
        for (Map.Entry<String, Integer> entry : enemyHistory.entrySet())
        {
            System.out.println(entry.getKey() + " x" + entry.getValue());
        }
    }
}