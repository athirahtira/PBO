import java.util.Scanner;

public class inputdata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan data mahasiswa");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();
        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        System.out.println("\nData mahasiswa");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai Tugas: " + nilaiTugas);
        System.out.println("Nilai UTS: " + nilaiUTS);
        System.out.println("Nilai UAS: " + nilaiUAS);
        
        double nilaiAkhir = (nilaiTugas + nilaiUTS + nilaiUAS) / 3;
        System.out.println("Nilai Akhir: " + nilaiAkhir);
        if (nilaiAkhir >= 60)
        {
            System.out.println("Status: LULUS");
        }
        else
        {
            System.out.println("Status: TIDAK LULUS");
        }

        for (int i = 1; i <= 100; i++)
        {
            System.out.println(nama + " akan mendapat nilai A pada praktikum PBO");
        }

        input.close();
    }
}
