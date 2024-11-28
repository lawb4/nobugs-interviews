package meet3.hw.task10;

import java.util.ArrayList;

/*Класс Order:
Поля: orderId, customer, productList, totalPrice.
Метод для расчета общей стоимости заказа.
*/
public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> productList;
    private double totalPrice = 0d;

    public Order(String orderId, Customer customer, ArrayList<Product> productList) {
        this.orderId = orderId;
        this.customer = customer;
        this.productList = new ArrayList<>(customer.getCart());
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotalPrice() {
        for (Product product : productList) {
            product.applyDiscount();
            this.totalPrice += product.getPrice();
        }
    }
}
