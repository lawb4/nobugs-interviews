package meet3.hw.task10;

import java.util.ArrayList;

/*Класс Order:
Поля: orderId, customer, productList, totalPrice.
Метод для расчета общей стоимости заказа.
*/
public class Order {
    private String orderId;
    private Customer customer;
    private ArrayList<Product> productList = getCustomer().getCart();
    private double totalPrice;

    public Order(String orderId) {
        this.orderId = orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public String getOrderId() {
        return orderId;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void calculateTotalPrice() {

        for (Product product : productList) {
            product.applyDiscount();
            this.totalPrice += product.getPrice();
        }
    }
}
