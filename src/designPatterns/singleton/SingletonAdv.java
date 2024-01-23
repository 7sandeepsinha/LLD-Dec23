package designPatterns.singleton;

public class SingletonAdv {
    private static SingletonAdv instance;

    private SingletonAdv(){
    }

    public static SingletonAdv getInstance(){
        if(instance == null){
            synchronized (SingletonAdv.class){
                if(instance == null){
                    instance = new SingletonAdv();
                }
            }
        }
        return instance;
    }
}
