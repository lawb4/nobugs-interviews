package meet3.hw.task10;

/*Класс Product:
Поля: id, name, price.
Абстрактный метод applyDiscount().*/
public abstract class Product {
    private String id;
    private String name;
    private double price;

    abstract public void applyDiscount(Order order);

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
