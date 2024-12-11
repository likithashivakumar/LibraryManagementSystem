package LibraryManagementSystem;

public class User extends Person {
    private String userId;

    public User(String name, String userId){
        super(name);
        this.userId=userId;
    }

    public String getUserId(){
        return userId;
    }

    public void displayDetails(){
        System.out.println("userId "+userId+" name"+getName());
    }
}
