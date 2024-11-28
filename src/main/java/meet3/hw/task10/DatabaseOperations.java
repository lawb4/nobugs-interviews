package meet3.hw.task10;

/*Интерфейс DatabaseOperations:
Методы: saveOrder(Order order) и getOrder(int orderId).*/
public interface DatabaseOperations {

    void saveOrder(Order order);

    Order getOrder(String orderId);
}
