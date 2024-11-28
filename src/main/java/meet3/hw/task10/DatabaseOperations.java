package meet3.hw.task10;

/*Интерфейс DatabaseOperations:
Методы: saveOrder(Order order) и getOrder(int orderId).*/
public interface DatabaseOperations {

    void saveOrder(Order order);

    void getOrder(int orderId);
}
