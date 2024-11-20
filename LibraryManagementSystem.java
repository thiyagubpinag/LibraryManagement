public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();
        library.addBook(new Book("Python Crash Course", "Eric Matthes", 3));
        library.addBook(new Book("Clean Code", "Robert C. Martin", 2));

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        library.borrowBook(user1, library.books.get(0));
        library.borrowBook(user2, library.books.get(1));

        library.returnBook(user1, library.books.get(0));
        library.returnBook(user2, library.books.get(1));
    }
}