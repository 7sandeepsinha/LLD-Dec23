package InheritanceAndPolymorphism;

public class Instructor extends User {

    public Instructor(String name, String email, String password){
        super(name, email, password);
        System.out.println("Constructor inside instructor");
    }
}
/*
        Instructor i = new Instructor();

        cons of Instructor -> cons of User ->     execute cons of User -> execute of Instructor
    [passed the attributes    [passed the values [execution is not possible
     from main to instructor   from instructor   without passing
     constructor]             to User]         attribute values]
 */