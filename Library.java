import java.util.*;

class Library {
    List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(User user, Book book) {
        if (book.copies > 0) {
            user.borrowedBooks.add(book);
            book.copies--;
            System.out.println(user.name + " borrowed " + book.title);
        } else {
            System.out.println("Borrowing limit reached or book not available");
        }
    }

    public void returnBook(User user, Book book) {
        if (user.borrowedBooks.contains(book)) {
            user.borrowedBooks.remove(book);
            for (Book b : books) {
                if (b.equals(book)) {
                    b.copies++;
                    break;
                }
            }
            System.out.println(user.name + " returned " + book.title);
        } else {
            System.out.println("Book not found in user's borrowed list");
        }
    }
}