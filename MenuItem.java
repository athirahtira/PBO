package root.menu;

public class MenuItem
{
    private String id;
    private String namaMakanan;
    private double harga;

    public MenuItem(String id, String namaMakanan, double harga)
    {
        this.id = id;
        this.namaMakanan = namaMakanan;
        this.harga = harga;
    }

    public String getId()
    {
        return id;
    }

    public String getNamaMakanan()
    {
        return namaMakanan;
    }

    public double getHarga()
    {
        return harga;
    }

    public static void main(String[] args)
    {
        MenuItem item1 = new MenuItem("1", "Nasi Goreng", 15000);
        System.out.println("ID: " + item1.getId());
        System.out.println("Nama Makanan: " + item1.getNamaMakanan());
        System.out.println("Harga: " + item1.getHarga());
    }
}
