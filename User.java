import java.util.*;

class User {
    String name;
    List<Book> borrowedBooks = new ArrayList<>();

    public User(String name) {
        this.name = name;
    }
}
