package constructor;

public class Main {
    public static void main(String[] args) {
        Student viplav = new Student(1, "Viplav", 95);
        Student nithin = new Student(2, "Nithin");
        Student dummy = new Student();

        //3 seats -> Viplav, Nithin, dummy
        System.out.println(viplav.totalMarks);

        System.out.println("Hi Hello");
        System.out.println(5);
        System.out.println(true);
        System.out.println('A');
    }
}
