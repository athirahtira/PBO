import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class User
{
    private static HashSet<String> users = new HashSet<>();
    private static Map<String, Integer> userPoints = new HashMap<>();

    public static boolean login(String username)
    {
        if (users.contains(username))
        {
            return true;
        }
        else
        {
            users.add(username);
            updateUserPoints(username, 10);
            return false;
        }
    }

    public static void updateUserPoints(String username, int points)
    {
        int currentPoints = userPoints.getOrDefault(username, 0);
        userPoints.put(username, currentPoints + points);
    }

    public static int getUserPoints(String username)
    {
        return userPoints.getOrDefault(username, 0);
    }
}