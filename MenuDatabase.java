package root.menu;

import java.util.ArrayList;

public class MenuDatabase
{
    private ArrayList<MenuItem> menuItems;

    public MenuDatabase()
    {
        this.menuItems = new ArrayList<>();
    }

    public void tambahMenuItem(MenuItem item)
    {
        menuItems.add(item);
    }

    public void hapusMenuItem(String id)
    {
        for (int i = 0; i < menuItems.size(); i++)
        {
            if (menuItems.get(i).getId().equals(id))
            {
                menuItems.remove(i);
                break;
            }
        }
    }

    public ArrayList<MenuItem> getMenuItems()
    {
        return new ArrayList<>(menuItems);
    }

    public MenuItem cariMenuItemById(String id)
    {
        for (MenuItem item : menuItems)
        {
            if (item.getId().equals(id))
            {
                return item;
            }
        }
        return null;
    }

    public MenuItem cariMenuItemByNama(String nama)
    {
        for (MenuItem item : menuItems)
        {
            if (item.getNamaMakanan().equalsIgnoreCase(nama))
            {
                return item;
            }
        }
        return null;
    }
}
