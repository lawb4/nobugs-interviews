package meet6.hw.prep;

import java.util.ArrayList;

/*Задача 5:
Спроектировать библиотеку, где:
В один момент времени активна одна книга
Можно переключаться между другими книгами
В книге всегда отображется последняя активная страница
*/
public class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void switchToBook(Book book) {
        book.setPageStatus(ReadableStatus.ACTIVE);
    }
}

class Book {
    private ArrayList<Page> pages;
    private ReadableStatus bookStatus;
    private ReadableStatus pageStatus;

    public Book() {
        pages = new ArrayList<>();
        bookStatus = ReadableStatus.INACTIVE;
        pageStatus = ReadableStatus.INACTIVE;
    }

    public void setPageStatus(ReadableStatus pageStatus) {
        this.pageStatus = pageStatus;
    }
}

class Page {

}

enum ReadableStatus {
    INACTIVE,
    ACTIVE
}

class Main {
    public static void main(String[] args) {

    }
}