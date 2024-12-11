package LibraryManagementSystem;

public class Book {
    private String title;
    private String author;
    private int publicationYear;
    private boolean isAvailable;

    public Book(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isAvailable = true;
    }
    

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public boolean isAvailable(){
        return isAvailable;
    }



    public void borrowBook(){
        if(isAvailable){
            isAvailable=false;
            System.out.println(title+" book has been borrowed");
        }else{
            System.out.println(title+" not borrowed ");
        }
    }

    public void returnBook(){
        isAvailable = true;
        System.out.println(title+"  book has been returned ");
    }


}
