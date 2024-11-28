package meet3.hw.task10;

/*Класс Product:
Поля: id, name, price.
Абстрактный метод applyDiscount().*/
public abstract class Product {
    private final String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    abstract public void applyDiscount();
}
