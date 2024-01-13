package advancedConcepts.lambdaStreams;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
/*
//        HelloWorldPrinter hwp = new HelloWorldPrinter();
//        Thread t = new Thread(hwp);
//        t.start();
*/
/*
         // implementation using Anonymous class -> can be used for any interface
          Runnable hwp = new Runnable(){
              public void run(){
                  System.out.println("Hello world");
              }
          };

          Runnable gdmp = new Runnable(){
              public void run(){
                  System.out.println("Good morning");
              }
          };

          Car c = new Car(){
              public void startEngine(){
                  System.out.println("Start engine");
              }
              public int startMedia(){
                  System.out.println("Start media");
                  return 0;
              }
          };
        System.out.println(c.startMedia());
        Thread t = new Thread(hwp);
        t.start();

         */
/*
        Runnable hwp = new Runnable(){
            public void run(){
                System.out.println("Hello world");
            }
        };
        Thread t = new Thread(hwp);
        Thread t1 = new Thread(() -> System.out.println("Hello world"));
        t1.start();
*/
/*
        //ClassName refVar = new ClassName(20, "A");
        Instructor<String> i = new Instructor<String>() {
            public void teach(int numberOfStudents, String batch) {
                System.out.println("Teaching student :" + numberOfStudents + " ,from batch :" + batch);
            }
        };
        i.teach(10,"A");

        Instructor<String> i2 = (noOfStudents, batchName) -> {
            System.out.println("From lambda -> Teaching student :" + noOfStudents + " ,from batch :" + batchName);
        };
        i2.teach(20, "B");

        Instructor<String> i3 = (noOfStudents, batchName) ->
                System.out.println("From lambda -> Teaching student :" + noOfStudents + " ,from batch :" + batchName);
        i3.teach(30, "C");

        Instructor<String> i4 =
            (numberOfStudents, batch) ->
                System.out.println("Teaching student :" + numberOfStudents + " ,from batch :" + batch);
*/
/*
        int x = 10;
        switch (x){
            case 1: {
                System.out.println("Hello World");
            }
            case 2: {
                System.out.println("Hi Hello");
            }
            case 3: {
                System.out.println("Good morning");
            }
        }

        // enhanced switch case -> Java 14 -> Java 17+
        switch (x){
            case 1 -> System.out.println("Hello World");
            case 2 -> System.out.println("case 2");
            case 3 -> System.out.println("Case 3");
            default -> System.out.println("Default");
        }

         */
/*
        //enhanced for loop
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        //enhanced for loop, not forEach
        for(int i : list){ // variable to hold the data one by one : collection
            System.out.println(i);
        }

         */
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        //print only even numbers
//        for(int i : list){
//            System.out.println(i);
//        }
        // Streams -> methods to do stuff
        //collection/map . stream()
        // FOREACH
//        list.stream().forEach(i -> {
//            if(i%2 == 0){
//                System.out.println(i);
//            }
//        });
//
//        list.stream().forEach(i -> System.out.println(i));

        //         List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
        // Square every number, and check if the result is even, if yes, print the square

//        for(int i=0;i<list.size();i++){
//            int sq = list.get(i) * list.get(i);
//            if(sq % 2 == 0){
//                System.out.println(list.get(i) * list.get(i));
//            }
//        }

        //make all the values square of the list, and print the squared values
//        list.stream().forEach(e -> System.out.println(e * e ));
//        System.out.println("Print list: " + list); // values of the list are never changed

        // map -> map the value coming in the stream to something // update
        list.stream() // 1 2 3 4 5
                .map(e -> (e * e)/2)
                .filter(e -> e%2==0)
                .forEach(e -> System.out.println(e));
        System.out.println("Print list: " + list);
        int i = 10;

        //lambda does not need return keyword for a single line logic
        Calculator s = (x) -> x*x;
    }
}
