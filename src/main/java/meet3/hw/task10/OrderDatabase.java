package meet3.hw.task10;

import java.util.HashMap;

/*Дополнительно:
Реализуйте интерфейс для работы с базой данных заказов, используя HashMap.*/
public class OrderDatabase implements DatabaseOperations {
    private HashMap<String, Order> orders = new HashMap<>();

    @Override
    public void saveOrder(Order order) {
        orders.put(order.getOrderId(), order);
        System.out.printf("Order saved with id: %s\n", order.getOrderId());
    }

    @Override
    public Order getOrder(String orderId) {
        return orders.get(orderId);
    }
}
