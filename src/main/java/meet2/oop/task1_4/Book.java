package meet2.oop.task1_4;

/*Задача 2: Класс "Книга"
Создайте класс Book, который описывает книгу:
Поля: title (название), author (автор), price (цена).
Конструктор, который принимает все три параметра.
Метод printInfo(), который выводит информацию о книге в формате:

Название: <title>, Автор: <author>, Цена: <price>

Пример использования:

Book book = new Book("Мастер и Маргарита", "М. Булгаков", 500);
book.printInfo();
*/
public class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void printInfo() {
        System.out.printf("Название: %s, Автор: %s, Цена: %.2f", this.title, this.author, this.price);
    }
}
