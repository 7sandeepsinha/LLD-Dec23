package designPatterns.prototype;

public class Main {
    public static void main(String[] args) {
//        Student studentPrototype = new Student("2023", "BatchA", "LLD", "Sandeep", "12-Dec-23", "TTS", "30-Apr-2024");
//        System.out.println("Student ProtoType");
//        System.out.println(studentPrototype);
//
//
//        System.out.println("Copy student");
//        Student studentCopy = studentPrototype.clone();
//        studentCopy.setName("Girish");
//        studentCopy.setEmail("g@mail.com");
//        studentCopy.setPhoneNumber("1234");
//        System.out.println(studentCopy);

        //Since, a single prototype will not work for all the batches, we need to have
        // multiple prototypes for each batch, hence need to maintain this is a datastructure
        Student studentPrototypeBatchA = new Student("2023", "BatchA", "HLD", "Sandeep", "12-June-23", "MWF", "30-Apr-2024");
        Student studentPrototypeBatchB = new Student("2023", "BatchB", "LLD", "naman", "12-Dec-23", "TTS", "30-June-2024");
        Student studentPrototypeBatchC = new Student("2024", "BatchC", "DSA", "mohit", "12-Jan-24", "MWF Morning", "30-Dec-2024");

        // Registry Design pattern comes into play as it contains a hashmap, that stores all the
        // prototypes of a class, which can fetched using a specific key, whenever required
        StudentRegistry studentRegistry = new StudentRegistry();
        studentRegistry.add(studentPrototypeBatchA);
        studentRegistry.add(studentPrototypeBatchB);
        studentRegistry.add(studentPrototypeBatchC);

        //enroll -> Kunal, k@email.com, 123456 -> BatchB
        Student kunal = studentRegistry.get("BatchB").clone();
        kunal.setName("Kunal");
        kunal.setEmail("k@email.com");
        kunal.setPhoneNumber("123456");
        System.out.println(kunal);
    }
}
