public class person
{
    String name;
    String address;
    final String country = "Indonesia";

    person(String forName, String forAddress)
    {
        this.name = forName;
        this.address = forAddress;
    }

    person(String forName)
    {
        this(forName, null);
    }

    person()
    {
        this(null);
    }

    void sayHello()
    {
        this.sayHello("Bos");
    }

    void sayHello(String forName)
    {
        System.out.println("Hello " + forName + ", My Name is " + name);
    }

    public static void main(String[] args)
    {
        var person = new person("Athirah", "Jakarta");

        person.name = "Athirah Rashida";
        
        person.sayHello("Naima");

        var person1 = new person("Athirah", null);
        var person2 = new person("Athirah");
        var person3 = new person();
    }
}