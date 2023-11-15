package bookshelf;

import bookshelf.bookstore.Book;

public class Main {
    public static void main(String[] args) {
        BookShelf myBookShelf = BookShelf.getInstance();

        for (int i = 0; i < 5; i++) {
            Book book = Generator.createBook();
            myBookShelf.addBook(book);
        }

        myBookShelf.printContent();
    }
}
