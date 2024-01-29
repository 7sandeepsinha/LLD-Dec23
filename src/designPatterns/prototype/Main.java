package designPatterns.prototype;

public class Main {
    public static void main(String[] args) {
        Student studentPrototype = new Student("2023", "BatchA", "LLD", "Sandeep", "12-Dec-23", "TTS", "30-Apr-2024");
        System.out.println("Student ProtoType");
        System.out.println(studentPrototype);


        System.out.println("Copy student");
        Student studentCopy = studentPrototype.clone();
        studentCopy.setName("Girish");
        studentCopy.setEmail("g@mail.com");
        studentCopy.setPhoneNumber("1234");
        System.out.println(studentCopy);
    }
}
