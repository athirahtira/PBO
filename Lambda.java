public class Lambda {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Anda Lulus dengan baik");
            case "B", "C" -> System.out.println("Anda Lulus");
            case "D" -> System.out.println("Anda tidak Lulus");
            default ->
            {
                System.out.println("Mungkin anda salah jurusan");
            }
        }
        var nilai1 = "B";
        String ucapan = switch(nilai1)
        {
            case "A":
            yield "Anda Lulus dengan baik";
            case "B", "C":
            yield "Anda Lulus";
            case "D":
            yield "Anda tidak Lulus";
            default:
            yield "Mungkin anda salah jurusan";
        };
        System.out.println(ucapan);
    }
}
