package SetExamplesComparable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Semain {
    public static void main(String[]args){
        List<Integer> ans=new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        Set<Integer> set=new HashSet<>();
        for (Integer inw:ans){
            Boolean s=set.add(inw);
            if (s){
                System.out.println(inw);
            }
        }
    }
}
