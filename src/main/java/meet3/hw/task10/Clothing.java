package meet3.hw.task10;

/*Подклассы Clothing:
Clothing: скидка 15% при покупке свыше $50.*/
public class Clothing extends Product {

    @Override
    public void applyDiscount(Order order) {
        double priceWithDiscount = order.getTotalPrice() * (1 - (double) 15 / 100);

        if (order.getTotalPrice() > 50) {
            order.setTotalPrice(priceWithDiscount);
        } else {
            System.out.println("Total price is less than $50. No discount is applied");
        }
    }
}
