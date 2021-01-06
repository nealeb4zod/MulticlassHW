import java.util.ArrayList;

public class Library {

    private int capacity;
    private ArrayList<Book> collection;

    public Library(){
        this.capacity = 2;
        this.collection = new ArrayList<>();
    }

    public int getBookCount() {
        return this.collection.size();
    }

    public void addBook(Book book){
        if (getBookCount() < capacity){
        this.collection.add(book);
        }
    }
}
