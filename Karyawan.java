class Karyawan 
{
    private String nama;
    private String idKaryawan;
    private double gajiPokok;
    private double bonus;
    private double potongan;

    public Karyawan(String nama, String idKaryawan, double gajiPokok)
    {
        this.nama = nama;
        this.idKaryawan = idKaryawan;
        this.gajiPokok = gajiPokok;
        this.bonus = 0;
        this.potongan = 0;
    }

    public double hitungGajiBersih()
    {
        return gajiPokok + bonus - potongan;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getIdKaryawan()
    {
        return idKaryawan;
    }

    public void setIdKaryawan(String idKaryawan)
    {
        this.idKaryawan = idKaryawan;
    }

    public double getGajiPokok()
    {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok)
    {
        if (gajiPokok >= 0)
        {
            this.gajiPokok = gajiPokok;
        }
        else
        {
            System.out.println("Gaji pokok tidak boleh negatif.");
        }
    }

    public double getBonus()
    {
        return bonus;
    }

    public void setBonus(double bonus)
    {
        this.bonus = bonus;
    }

    public double getPotongan()
    {
        return potongan;
    }

    public void setPotongan(double potongan)
    {
        this.potongan = potongan;
    }
}