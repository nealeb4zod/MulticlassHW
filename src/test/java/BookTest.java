import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
    private Book book1;

    @Before
    public void before(){
         book1 = new Book("book1 title", "book1 author", "book1 genre");
    }

    @Test
    public void hasTitle(){

        assertEquals("book1 title", book1.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("book1 author", book1.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("book1 genre", book1.getGenre());
    }
}
