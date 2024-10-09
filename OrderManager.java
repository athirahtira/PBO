package root.order;

import java.util.ArrayList;

public class OrderManager
{
    private ArrayList<Order> orders;

    public OrderManager()
    {
        this.orders = new ArrayList<>();
    }

    public void buatPesanan(Order order)
    {
        orders.add(order);
    }

    public void hapusPesanan(String id)
    {
        for (int i = 0; i < orders.size(); i++)
        {
            if (orders.get(i).getId().equals(id))
            {
                orders.remove(i);
                break;
            }
        }
    }

    public ArrayList<Order> getOrders()
    {
        return new ArrayList<>(orders);
    }

    public Order cariPesananById(String id)
    {
        for (Order order : orders)
        {
            if (order.getId().equals(id))
            {
                return order;
            }
        }
        return null;
    }
}