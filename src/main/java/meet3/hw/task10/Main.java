package meet3.hw.task10;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("uid1", "Viktor Dobriy", "viktordobriy@mail.com");

        customer.displayUserInfo();

        Admin admin = new Admin("admin01", "Admin01", "admin01@admin.com");
        Product iphone = new Electronics("electrId001", "iPhone 16", 1000);
        Product jeans = new Clothing("clothId001", "Pair of Jeans", 60);

        System.out.printf("%s price = %.2f\n", iphone.getName(), iphone.getPrice());
        System.out.printf("%s price = %.2f\n", jeans.getName(), jeans.getPrice());

        admin.updatePrice(jeans, 40);
        System.out.printf("%s new price = %.2f\n", jeans.getName(), jeans.getPrice());

        customer.addProduct(iphone);
        customer.addProduct(jeans);

        Order order = new Order("orderId001", customer, customer.getCart());
        order.calculateTotalPrice();
        System.out.println("Total order price = " + order.getTotalPrice());


        OrderDatabase db = new OrderDatabase();
        db.saveOrder(order);

        Order retrievedOrder = db.getOrder(order.getOrderId());
        System.out.printf("Order retrieved. id = %s, total price = %.2f\n", retrievedOrder.getOrderId(), retrievedOrder.getTotalPrice());
    }
}
