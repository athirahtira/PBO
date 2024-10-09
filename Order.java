package root.order;

import root.menu.MenuItem;
import util.IDGenerator;

import java.util.ArrayList;

public class Order
{
    private String id;
    private ArrayList<root.menu.MenuItem> items;

    public Order()
    {
        this.id = IDGenerator.generateID();
        this.items = new ArrayList<>();
    }

    public void tambahItem(MenuItem item)
    {
        items.add(item);
    }

    public void hapusItem(MenuItem item)
    {
        items.remove(item);
    }

    public ArrayList<MenuItem> getItems()
    {
        return new ArrayList<>(items);
    }

    public String getId()
    {
        return id;
    }
}
