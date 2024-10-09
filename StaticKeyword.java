class Constant
{
    public static final String Application = "Belajar Java";
    public static final int Version = 1;
}

class Application
{
    public static final int Processors;
    static
    {
        System.out.println("Mengakses class Application");
        Processors = Runtime.getRuntime().availableProcessors();
    }
}

class MathUtil
{
    public static int sum(int... values)
    {
        int total = 0;
        for (var value : values)
        {
            total += value;
        }
        return total;
    }
}

class Country
{
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public static class City
    {
        private String name;
        public String getName()
        {
            return name;
        }
        public void setName(String name)
        {
            this.name = name;
        }
    }
}

public class StaticKeyword
{
    public static void main(String[] args)
    {
        System.out.println(Constant.Application);
        System.out.println(Constant.Version);

        System.out.println(MathUtil.sum(1,1,1,1,1));

        Country.City city = new Country.City();
        city.setName("Batam");

        System.out.println(city.getName());
        System.out.println(Application.Processors);
    }
}
