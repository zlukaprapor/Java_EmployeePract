package bookshelf.bookstore;
import java.util.logging.Level;
import java.util.logging.Logger;
public abstract class Book implements Cloneable {
    private int ISBN;
    private int pages;
    protected String genre;



    public Book() {
        this.ISBN = 0;
        this.pages = 0;
        this.genre = "";
    }
    public int getISBN() {
        return ISBN;
    }

    public int getPages() {
        return pages;
    }

    public String getGenre() {
        return genre;
    }
    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public abstract void printContent();
    private static final Logger logger = Logger.getLogger(Book.class.getName());
    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            logger.log(Level.SEVERE, "Cloning failed", e);
            return null;
        }
    }

    @Override
    public String toString() {
        return "Книга{" +
                "ISBN=" + ISBN +
                ", сторінки=" + pages +
                ", жанр='" + genre + '\'' +
                '}';
    }
}