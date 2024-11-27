package meet3.hw.task6;

import java.util.Objects;

/*Задача 6: Класс "Товар"
Описание:
Создайте класс Product, который будет представлять товар.
Класс должен содержать:
Поля:
Название (name) — строка.
Цена (price) — double.
Уникальный идентификатор (id) — int.
Конструкторы:
Конструктор по умолчанию.
Конструктор с параметрами.
Методы:
Переопределите equals и hashCode так, чтобы товары считались равными, если совпадают их id.
Переопределите toString для вывода информации о товаре.
Реализуйте clone для копирования товара.*/
public class Product implements Cloneable {
    private String name;
    private double price;
    private String id;

    public Product() {
    }

    public Product(String name, double price, String id) {
        this.name = name;
        this.price = price;
        this.id = id;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(id, product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id='" + id + '\'' +
                '}';
    }

    @Override
    public Product clone() {
        return new Product(this.name, this.price, this.id);
    }
}
