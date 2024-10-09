public class TipeData {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 1000000;
        long iniLong = 1000000;
        long iniLong2 = 1000000L;

        float iniFloat = 10.12F;
        double iniDouble = 12.2424;

        int decimalInt = 25;
        int hexInt = 0xA132B;
        int binInt = 0b1010101;

        long balance = 1_000_000_000_000L;
        int sum = 60_000_000;

        byte iniByte2 = 10;
        short iniShort2 = iniByte2;
        int iniInt2 = iniShort;
        long iniLong3 = iniInt;
        float iniFloat2 = iniLong;
        double iniDouble2 = iniFloat;

        float iniFloat3 = (float) iniDouble;
        long iniLong4 = (long) iniFloat3;
        int iniInt3 = (int) iniLong4;
        short iniShort3 = (short) iniInt3;

        System.out.println(iniShort2);
        System.out.println(iniShort3);

        char e = 'E';
        char k = 'K';
        char o = 'O';

        System.out.println(e);
        System.out.println(k);
        System.out.println(o);
        
        System.out.print(e);
        System.out.print(k);
        System.out.println(o);

        boolean benar = true;
        boolean salah = false;

        System.out.println(benar);
        System.out.println(salah);

        String firstName = "Athirah";
        String lastName = "Rashida";

        System.out.println(firstName);
        System.out.println(lastName);

        System.out.println(firstName + " " + lastName);

        String name;
        name = "Athirah Rashida";
        int age = 19;
        String address = "Indonesia";
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);

        var age1 = 19;
        var address1 = "Indonesia";
        System.out.println(age);
        System.out.println(address);

        final String name1 = "Athirah Naima";
        System.out.println(name1);

        Integer ageObject = age;
        int ageAgain = ageObject;
        short shortAge = ageObject.shortValue();
        byte byteAge = ageObject.byteValue();

        String[] arrayString;
        arrayString = new String[3];
        arrayString[0] = "Athirah";
        arrayString[1] = "Rashida";
        arrayString[2] = "Naima";

        int[] arrayInt = new int[]
        {
            10, 90, 80, 60, 20
        };
        long[] arrayLong = 
        {
            10, 90, 80, 60, 20
        };

        arrayLong[0] = 100;

        System.out.println(arrayLong[0]);
        System.out.println(arrayLong[1]);
        System.out.println(arrayLong.length);

        String[][] members =
        {
            {"Athirah", "Rashida"},
            {"Harihta", "Adihsar"},
            {"Pebry", "Ajeng"},
        };

        String[] member1 = members[0];
        System.out.println(member1[0]);
        System.out.println(members[1][0]);
        System.out.println(members[2][0]);

        int a= 100;
        int b = 10;
        System.out.println(a+b);
        System.out.println(a-b);
    }
}
