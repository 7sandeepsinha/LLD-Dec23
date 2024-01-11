package advancedConcepts.collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        Student nithin = new Student(1, "Nithin");
        System.out.println(nithin.hashCode());
        Student ashutosh = new Student(1, "Ashutosh");
        System.out.println(ashutosh.hashCode());

        System.out.println(nithin.hashCode() == ashutosh.hashCode());

        System.out.println(nithin.equals(ashutosh));

        HashSet<Student> set = new HashSet<>();
        set.add(nithin); //1st duplicate
        set.add(ashutosh); // 2nd duplicate
        System.out.println(set);

        System.out.println("-----------");
        Count c1 = new Count(10);
        Count c2 = new Count(10);
        System.out.println(c1.equals(c2));

        HashMap<Integer, Student> map = new HashMap<>();

    }
}
/*
1. Both -> NO
2. Nithin
3. Ashutosh
 */

/*
    equals() && ==
    == -> always compares using the hashcode
    equals() -> method
    If we dont override equals() -> default behaviour -> internally uses ==

break -> 6 mins
 */