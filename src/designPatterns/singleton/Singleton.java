package designPatterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton(){
    }

    public static Singleton getObject(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}

