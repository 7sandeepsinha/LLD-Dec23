package advancedConcepts.exceptionHandling;

import java.util.Scanner;

public class Calculator {
    public int x;
    public void divide(String a, String b){
        Scanner sc = new Scanner(System.in);
        try {
            int n = sc.nextInt();
            if(a == null || b == null){
                throw new NullPointerException("Input parameters cant be null");
            }
            int x = Integer.parseInt(a);
            int y = Integer.parseInt(b);
            System.out.println(x / y);
        } catch (ArithmeticException e){
            System.out.println("Dont divide by zero");
        } catch (NumberFormatException e){
            System.out.println("Number format in string is not correct");
        } catch (Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace(); // print the flow of code till the point things went wrong
            System.out.println("Something went wrong");
        } finally { // No matter what happens, finally block will always execute
            sc.close();
        }
    }

    public void finalise(){
        System.out.println("Calculator object is being destroyed");
    }
}
// make the code as specific and granular as possible
// throws, finally, finalise, [ final, finally and finalise]
// finalise is a method is called before destroying an object of that class

/*
        switch(int x)
        case 1
        case 2
        default
 */
