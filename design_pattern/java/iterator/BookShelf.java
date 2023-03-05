import java.util.ArrayList;
import java.util.Iterator;

public class BookShelf implements Iterable<Book> {
    private ArrayList<Book> books;
    public BookShelf(int init_size) {
        this.books = new ArrayList<>(init_size);
    }
    public Book getBookAt(int index) {
        return books.get(index);
    }
    public void appendBook(Book book) {
        this.books.add(book);
    }
    public int getLength() {
        return this.books.size();
    }
    public Iterator<Book> iterator() {
        return new BookShelfIterator(this);
    }
}