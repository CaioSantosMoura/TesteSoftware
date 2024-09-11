package org.example;
import java.util.ArrayList;
import java.util.List;
public class OrderService {

    private List<String> orders;

    public OrderService(){
        this.orders = new ArrayList<>();
    }

    public void addOrder(String order){
        orders.add(order);
    }

    public void removeOrder(String order){
        orders.remove(order);
    }

    public List<String> getAllOrders(){
        return orders;
    }

    public void clearAllOrders(){
        orders.clear();
    }
}