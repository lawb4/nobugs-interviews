package meet3.hw.task10;

import java.util.ArrayList;

/*Подкласс Customer:
Customer: добавляет поле cart (корзина), метод для добавления товара в корзину.*/
public class Customer extends User {
    private ArrayList<Product> cart = new ArrayList<>();

    public void addProduct(Product product) {
        cart.add(product);
    }
}