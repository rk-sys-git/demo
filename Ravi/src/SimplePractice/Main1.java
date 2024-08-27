package SimplePractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main1 {
    public static void main(String[]args){
        Set<Integer> a = new HashSet<>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(1);
        a.add(3);
        a.add(4);

        List<Integer> arr = new ArrayList<>(a);
        System.out.println(arr);
        System.out.println(arr.get(1));
    }
}
