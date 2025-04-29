import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        Order order1 = new Order("001", "Іван", Arrays.asList("Борщ", "Вареники"));
        Order order2 = new Order("002", "Олена", Arrays.asList("Котлета", "Салат"));

        restaurant.addOrder(order1);
        restaurant.addOrder(order2);

        System.out.println("Всі замовлення:");
        restaurant.printAllOrders();

        System.out.println("\nПошук замовлення 001:");
        System.out.println(restaurant.findOrder("001"));

        restaurant.removeOrder("002");

        System.out.println("\nПісля видалення замовлення 002:");
        restaurant.printAllOrders();
    }
}
