package SetExample;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class One {
    public static void main(String[]args){
      /*  List<Integer> ans=new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(3);
        ans.add(4);
        ans.add(4);
        ans.add(2);
        ans.add(5);*/

        Set<Integer> integerSet=new HashSet<>();

        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
        integerSet.add(4);
        integerSet.add(4);
        integerSet.add(2);
        integerSet.add(5);
        for (Integer integer:integerSet){
            Boolean s=integerSet.add(integer);
            if (!s) {
                System.out.println(integer);
            }
        }


        //for (Integer integer:ans) {
            //System.out.println(integer);


            //Boolean s=integerSet.add(ans);
           // System.out.println(integerSet);
           /* if (!s){
                System.out.println(ans);

            }*/
       // }
    }
}
