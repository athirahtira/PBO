public class ForLoop {
   public static void main(String[] args) {
    var counter = 1;

    for (; counter <= 10;)
    {
        System.out.println("Perulangan ke-" + counter);
        counter++;
    }

    for (var counter1 = 1; counter1 <= 10; counter1++)
    {
        System.out.println("Perulangan ke-" + counter1);
    }

    var counter2 = 1;
    while (counter2 <= 10)
    {
        System.out.println("Perulangan ke-" + counter2);
        counter2++;
    }

    var counter3 = 100;
    do{
        System.out.println("perulangan ke-" + counter3);
        counter3++;
    } while(counter3 <= 10);
   } 
}
