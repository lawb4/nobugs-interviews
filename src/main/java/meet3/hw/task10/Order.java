package meet3.hw.task10;

import java.util.ArrayList;

/*Класс Order:
Поля: orderId, customer, productList, totalPrice.
Метод для расчета общей стоимости заказа.
*/
public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> productList = new ArrayList<>();
    private double totalPrice;

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double calculateTotalPrice() {
        for (Product product : productList) {
            this.totalPrice += product.getPrice();
        }
        return this.totalPrice;
    }
}
