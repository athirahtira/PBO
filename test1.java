import java.util.Scanner;

public class test1 {

    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        try{
            System.out.println("enter username");
            String username = myObj.nextLine();
            System.out.println("Username is: " + username);  
        }
        finally {
            myObj.close();
        }
    }
    
}
