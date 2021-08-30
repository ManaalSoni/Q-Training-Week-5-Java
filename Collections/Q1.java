/* 
QUESTION - Write a program that prints its arguments  in random order. Do not make  a copy of the argument array. 
Demonstrate  how to print out the elements  using both streams  and the traditional enhanced for statement.
*/

import java.util.*;

public class Q1 {

    public static void main(String[] args) {
        
        // Get and shuffle the list of arguments
        List<String> a = Arrays.asList(args);
        Collections.shuffle(a);

        // Print out the elements using JDK 8 Streams
        a.stream()
        .forEach(e->System.out.format("%s ",e));

        // Print out the elements using for-each
        for (String arg: a) {
            System.out.format("%s ", arg);
        }

        System.out.println();
    }
}