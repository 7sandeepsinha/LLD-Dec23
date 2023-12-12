package InheritanceAndPolymorphism;

public class User {
    public String name;
    public String email;
    public String password;



    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
        System.out.println("Constructor inside user");
    }
}
