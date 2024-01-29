package designPatterns.prototype;

import java.util.HashMap;

public class StudentRegistry {
    private HashMap<String, Student> studentRegistry;

    public StudentRegistry() {
        this.studentRegistry = new HashMap<>();
    }

    public Student add(Student studentPrototype){
        studentRegistry.put(studentPrototype.getBatchName(), studentPrototype);
        return studentPrototype;
    }

    public Student get(String batchName){
        return studentRegistry.get(batchName);
    }


}
