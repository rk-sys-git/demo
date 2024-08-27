package MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaptoMap {
    public static void main(String[]args){
        Map m1=new HashMap<>();
        m1.put(1,"ravi");
        m1.put(2,"kumar");
        m1.put(3,"uday");
        m1.put(4,"kumar");
        Set s=m1.keySet();
        Map m2=new HashMap<>();
        for (Object o1:s) {
            Object output = m1.get(o1);

            m2.put(o1, output);
        }
            Set s1=m2.keySet();
            for (Object o2:s1){
                Object output2=m2.get(o2);
                System.out.println(o2+"---"+output2);
            }
        }
    }

