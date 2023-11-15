package bookshelf;

import bookshelf.bookstore.Book;
import bookshelf.bookstore.BookCash;

import java.util.Random;

public class Generator {
    static Book createBook() {
        BookCash.loadCache();
        Random rand = new Random();
        int max = 9999, min = 1111;
        int id = rand.nextInt(3) + 1;
        Book book = BookCash.getBook(id);
        book.setISBN(rand.nextInt(max - min + 1) + min);
        book.setPages(rand.nextInt(max / 90 - min / 300 + 1) + min / 300);
        return book;
    }
}
