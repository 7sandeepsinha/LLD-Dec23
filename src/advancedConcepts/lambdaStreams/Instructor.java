package advancedConcepts.lambdaStreams;

@FunctionalInterface
public interface Instructor<T> {
    void teach(int numberOfStudents, T batch); // by default all abstract methods in an interface are public
}


