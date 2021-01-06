import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before(){
        library = new Library();
        book1 = new Book("book1 title", "book1 author", "book1 genre");
        book2 = new Book("book2 title", "book2 author", "book2 genre");
        book3 = new Book("book3 title", "book3 author", "book3 genre");
    }

    @Test
    public void getTotalBooks(){
        assertEquals(0, library.getBookCount());
    }

    @Test
    public void addBookTLibrary(){
        library.addBook(book1);
        assertEquals(1, library.getBookCount());
    }

    @Test
    public void checkLibraryCapacity(){
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        assertEquals(2, library.getBookCount());
    }
}
