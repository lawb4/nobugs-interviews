package meet3.hw.task9;

import java.util.ArrayList;

/*Дополнительное задание:
Создайте класс Library, который будет управлять несколькими книгами. Реализуйте методы:
Добавление книги в библиотеку.
Поиск книги по названию.
Вывод всех доступных книг.*/
public class Library {
    private final ArrayList<Book> library = new ArrayList<>();

    public void addBook(Book book) {
        library.add(book);
    }

    public Book findBookByName(String title) {
        for (Book book : library) {
            if (book.getTitle().equals(title)) {
                return book;
            }
        }
        throw new IllegalArgumentException("Book not found: " + title);
    }

    public void printAllAvailableBooks() {
        for (Book book : library) {
            if (book.isAvailable()) {
                System.out.println(book.getBookInfo());
            }
        }
    }
}