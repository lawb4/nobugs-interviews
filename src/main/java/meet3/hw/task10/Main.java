package meet3.hw.task10;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("uid1", "Viktor Dobriy", "viktordobriy@mail.com");

        Admin admin = new Admin("admin01", "Admin01", "admin01@admin.com");

        Product iphone = new Electronics("electrId001", "iPhone 16", 1000);

        Product jeans = new Clothing("clothId001", "Pair of Jeans", 30);

        customer.addProduct(iphone);
        customer.addProduct(jeans);

        Order order = new Order("orderId001");
        order.calculateTotalPrice();
        System.out.println("Total Order Price: " + order.getTotalPrice());

        OrderDatabase db = new OrderDatabase();
        db.saveOrder(order);

        Order retrievedOrder = db.getOrder(order.getOrderId());
        System.out.println("Retrieved Order Price: " + retrievedOrder.getTotalPrice());
    }
}
