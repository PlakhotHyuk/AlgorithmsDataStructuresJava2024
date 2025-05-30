import java.util.HashMap;
import java.util.Map;

public class Restaurant {
    private Map<String, Order> orders = new HashMap<>();

    public void addOrder(Order order) {
        orders.put(order.getOrderNumber(), order);
    }

    public void removeOrder(String orderNumber) {
        orders.remove(orderNumber);
    }

    public Order findOrder(String orderNumber) {
        return orders.get(orderNumber);
    }

    public void printAllOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders.");
        } else {
            for (Order order : orders.values()) {
                System.out.println(order);
            }
        }
    }
}
