package SimplePractice;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class hashexp {
    public static void main(String[]args){
        Set value=new HashSet();
        value.add("ravi");
        value.add(10);
        value.add(null);
        value.add("278");
        value.add("rl");
        value.add(null);
        value.add(null);

        for(Object gj:value){
            System.out.println(gj);
        }

    }
}
