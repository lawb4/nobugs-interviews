package meet3.hw.task10;

/*Подкласс Admin:
Admin: добавляет метод для изменения цены товара.*/
public class Admin extends User {

    public void updatePrice(Product product, double price) {
        product.setPrice(price);
    }
}
