package meet3.hw.task9;

/*Задача 9: Библиотека
Описание задачи:
Создайте класс Book, который будет представлять книгу в библиотеке. Класс должен иметь следующие свойства:
Название книги (title) — строка.
Автор книги (author) — строка.
Год издания (yearPublished) — целое число.
Статус книги (isAvailable) — логическое значение (доступна или нет).
Класс должен содержать следующие методы:
Конструктор, который инициализирует все поля.
Метод borrowBook(), который помечает книгу как недоступную.
Метод returnBook(), который помечает книгу как доступную.
Метод getBookInfo(), который возвращает строку с информацией о книге (например: "Название: Название книги, Автор: Автор книги, Год издания: 2020, Доступна: true").
*/
public class Book {
    private String title;
    private String author;
    private int yearPublished;
    private boolean isAvailable;

    public Book(String title, String author, int yearPublished, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.isAvailable = isAvailable;
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void borrowBook() {
        this.isAvailable = false;
    }


    public void returnBook() {
        this.isAvailable = true;
    }

    public String getBookInfo() {
        return String.format("Название: %s, Автор: %s, Год издания: %d, Доступна: %b",
                this.title, this.author, this.yearPublished, this.isAvailable);
    }
}
