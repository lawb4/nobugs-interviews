package meet3.hw.task10;

/*Подклассы Clothing:
Clothing: скидка 15% при покупке свыше $50.*/
public class Clothing extends Product {

    public Clothing(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if (this.getPrice() > 50) {
            this.setPrice(this.getPrice() * 0.85);
        } else {
            System.out.println("This clothing product's price is less than $50. No discount is applied for this product");
        }
    }
}
