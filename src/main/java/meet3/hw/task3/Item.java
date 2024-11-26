package meet3.hw.task3;

/*Задача 3: Класс для представления единицы товара
Описание:
Создайте класс Item, который будет представлять товар.
Класс должен содержать:
Поля:
Название товара (name).
Цена товара (price).
Количество на складе (quantity).
Методы:
sell(int amount): уменьшает количество на складе на заданное значение, если достаточно товара.
restock(int amount): добавляет указанное количество на склад.
getInfo(): возвращает строку с информацией о товаре.*/
public class Item {
    private String name;
    private double price;
    private int quantity;

    public void sell(int amount) {
        if (amount > this.quantity) {
            throw new IllegalArgumentException("Недостаточно товара!");
        }
        this.quantity -= amount;
    }

    public void restock(int amount) {
        this.quantity += amount;
    }

    public String getInfo() {
        return String.format("Товар: %s, Цена: %.2f, Количество на складе: %d",
                this.name, this.price, this.quantity);
    }
}
