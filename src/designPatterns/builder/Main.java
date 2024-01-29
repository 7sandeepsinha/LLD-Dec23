package designPatterns.builder;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Student s = Student.builder()
                .universityName("IIIITTTT")
                .phoneNumber("12344235")
                .age(12)
                .gradYear(2021)
                .name("Prateek")
                .id(1)
                .build();

        System.out.println(s);

        /*
                1. Builder object
                2. SetId
                3. SetName


                Student.builder() // b
                Student.builder().id(1) // b.setId(1)
                Student.builder().id(1).name("A") // b.setId(1), b.setName("A")

                Student.builder()
                .id(1)
                .name("A")
         */

    }
}
