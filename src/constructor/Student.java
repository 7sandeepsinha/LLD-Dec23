package constructor;

public class Student {
    public int id;
    public String name;
    public int totalMarks;

    //constructor overloading
    public Student(){ //Student()
    }

    public Student(int sId, String sName, int sTotalMarks){ // Student(int, String, int)
        id = sId;
        name = sName;
        totalMarks = sTotalMarks;
    }

    public Student(int sId, String sName) { // Student(int, String)
        id = sId;
        name = sName;
    }
}
