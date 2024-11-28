package meet3.hw.task10;

/*Подкласс Electronics:
Electronics: скидка 10% при покупке свыше $100.*/
public class Electronics extends Product {

    @Override
    public void applyDiscount(Order order) {
        double priceWithDiscount = order.getTotalPrice() * (1 - (double) 10 / 100);

        if (order.getTotalPrice() > 100) {
            order.setTotalPrice(priceWithDiscount);
        } else {
            System.out.println("Total price is less than $50. No discount is applied");
        }
    }
}