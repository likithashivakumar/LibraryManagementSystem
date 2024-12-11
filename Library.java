package LibraryManagementSystem;

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library(){
        books = new ArrayList<>();
    }

    public void addBook(Book book){
        books.add(book);
        System.out.println(book.getTitle()+"has been added");
    }

    public void displayBooks(){
        for(Book book: books){
            System.out.println(book.getTitle() + " by " + book.getAuthor() + " (Published: " + book.getPublicationYear() + ")");
        
        }
    }
}
