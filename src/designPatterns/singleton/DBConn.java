package designPatterns.singleton;

public class DBConn { //following Singleton pattern
    private int noOfConn = 0;
    private final int limit = 10;
    private static DBConn instance; // store address to DBConn object in heap

    private DBConn(){}

    public static DBConn getDBConnObject(){ // return a reference variable, that stores address to DBCOnnec object in heap
        if(instance == null){
            instance = new DBConn();
        }
        return instance;
    }

    public boolean connect(){
        if(noOfConn < limit){
            noOfConn++;
            return true;
        }else {
            return false;
        }
    }
}
// variable -> int x;
// Car c = new Car();
// Car c; ->