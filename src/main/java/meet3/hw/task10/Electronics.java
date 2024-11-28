package meet3.hw.task10;

/*Подкласс Electronics:
Electronics: скидка 10% при покупке свыше $100.*/
public class Electronics extends Product {

    public Electronics(String id, String name, double price) {
        super(id, name, price);
    }

    @Override
    public void applyDiscount() {
        if (this.getPrice() > 100) {
            this.setPrice(this.getPrice() * 0.90);
        } else {
            System.out.println("This electronic product's price is less than $100. No discount is applied for this product");
        }
    }
}