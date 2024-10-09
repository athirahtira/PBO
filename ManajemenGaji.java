public class ManajemenGaji
{
    public static void main(String[] args)
    {
        Karyawan karyawan1 = new Karyawan("Harihta", "IO90", 1200000);
        karyawan1.setBonus(1000);
        karyawan1.setPotongan(500);

        Karyawan karyawan2 = new Karyawan("Adihsar", "IO80", 1500000);
        karyawan2.setBonus(400);
        karyawan2.setPotongan(400);

        System.out.println("ID Karyawan\tNama\tGaji Bersih");
        System.out.println(karyawan1.getIdKaryawan() + "\t\t" + karyawan1.getNama() + "\t" + karyawan1.hitungGajiBersih());
        System.out.println(karyawan2.getIdKaryawan() + "\t\t" + karyawan2.getNama() + "\t" + karyawan2.hitungGajiBersih());
    }
}