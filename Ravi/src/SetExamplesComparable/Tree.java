package SetExamplesComparable;

import java.util.Set;
import java.util.TreeSet;

public class Tree {
    public static void main(String[]args){
        Set<Integer> integerSet=new TreeSet<>();
        integerSet.add(1);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(6);
        integerSet.add(4);
        //integerSet.add(null);
        for (Integer io:integerSet){
            System.out.println(io);
        }
    }
}
