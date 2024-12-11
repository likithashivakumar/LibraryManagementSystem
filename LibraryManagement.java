package LibraryManagementSystem;

public class LibraryManagement {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Harry Potter", "J.K. Rowling", 2001);
        Book book2 = new Book("The Hobbit", "J.R.R. Tolkien", 1937);
        library.addBook(book1);
        library.addBook(book2);


        System.out.println("books in library ");
        library.displayBooks();
    }
}
