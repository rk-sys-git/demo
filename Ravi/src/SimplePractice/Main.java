package SimplePractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(2);
        ans.add(3);
        ans.add(4);

        Set<Integer> a=new HashSet<>();
        for (Integer inter:ans){
            Boolean s=a.add(inter);
            if (s){
                System.out.println(inter);
            }
        }



    }
}
