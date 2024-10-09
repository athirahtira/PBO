public class student
{
    String nama;
    int nilai;
    public student ()
    {
        
    }
    public student(String nama, int nilai)
    {
        this.nama = nama;
        this.nilai = nilai;
    }
    void details()
    {
        
        System.out.print(nama + ' ' + nilai);
    }
}