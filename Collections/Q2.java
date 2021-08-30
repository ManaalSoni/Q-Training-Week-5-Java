/*
QUESTION - Take  the FindDupsexample  and modify it to use  a SortedSet  instead of a Set. 
 Specify a Comparator so that case  is ignored when sorting and identifying set elements.
*/

import java.util.*;

public class Q2 {

    static final Comparator<String> IGNORE_CASE_ORDER
            = new Comparator<String>() {
        public int compare(String s1, String s2) {
            return s1.compareToIgnoreCase(s2);
        }
    };

    public static void main(String[] args) {
        
        SortedSet<String> s = new TreeSet<String>(IGNORE_CASE_ORDER);
        for (String a : args) {
            s.add(a);
        }
        System.out.println(s.size() + " distinct words: " + s);
    }
}