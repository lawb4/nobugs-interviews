package meet3.hw.task10;

/*Подкласс Admin:
Admin: добавляет метод для изменения цены товара.*/
public class Admin extends User {

    public Admin(String id, String name, String email) {
        super(id, name, email);
    }

    public void updatePrice(Product product, double price) {
        product.setPrice(price);
    }
}
