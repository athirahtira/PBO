public class method {
    public static void main(String[] args)
    {
        sayHelloWorld();

        sayHello();
        sayHello("Athirah");
        sayHello("Athirah", "Naima");

        var a = 100;
        var b = 200;
        System.out.println(sum(a, b));

        sayCongrats("Athirah", 80, 90, 70);

        System.out.println(factorialRecursive(3));
    }

    static void sayHelloWorld()
    {
        System.out.println("Hello World");
    }

    static void sayHello() 
    {
        System.out.println("Hello");
    }

    static void sayHello (String firstName)
    {
        System.out.println("Hello " + firstName);
    }

    static void sayHello(String firstName, String lastName)
    {
        System.out.println("Hello " + firstName + " " + lastName);
    }

    static int sum(int value1, int value2)
    {
        var total = value1 + value2;
        return total;
    }

    static void sayCongrats(String name, int... values)
    {
        int total = 0;
        for (var value : values)
        {
            total += value;
        }
        int finalValue = total / values.length;
        if (finalValue >= 75)
        {
            System.out.println("Selamat " + name + ", Anda Lulus");
        }
        else
        {
            System.out.println(name + "Anda tidak Lulus");
        }
    }

    static int factorialRecursive(int value)
    {
        if (value == 1)
        {
            return 1;
        }
        else
        {
            return value * factorialRecursive(value - 1);
        }
    }
}