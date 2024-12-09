package meet6.hw;

/*Задача 5:
Спроектировать библиотеку, где:
1. В один момент времени активна одна книга
2. Можно переключаться между другими книгами
3. В книге всегда отображается последняя активная страница

Library
- Книга активная (книга) измен

метод Switch (книга) void

Book
- бул активности книги (измен)
- int последняя активная страница (изм)

*/
public class Library {
    private Book activeBook;

    public void switchToBook(Book book) {
        if (activeBook != null) {
            activeBook.setActive(false);
        }
        activeBook = book;
        activeBook.setActive(true);
    }
}

class Book {
    private boolean isActive;
    private int lastActivePage;

    public Book() {
        isActive = false;
        lastActivePage = 1;
    }

    public void setActive(boolean active) {
        this.isActive = active;

        if (active) {
            displayPage();
        }
    }

    public void displayPage() {
        System.out.println(lastActivePage);
    }

    // имитация чтения книги
    public void setLastActivePage(int lastActivePage) {
        this.lastActivePage = lastActivePage;
    }
}

class Main {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book();
        Book book2 = new Book();


        library.switchToBook(book1); // вывод текущей последней страницы = 1
        book1.setLastActivePage(11); //11

        library.switchToBook(book2); // вывод текущей последней страницы = 1
        book2.setLastActivePage(80); //80

        library.switchToBook(book1); // = 11
        library.switchToBook(book2); // = 80
    }
}

