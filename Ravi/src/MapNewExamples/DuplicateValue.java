package MapNewExamples;

import java.util.*;

public class DuplicateValue {
    public static void main(String[]args){
        List list=new ArrayList<>();
        list.add("uday");
        list.add("ravi");
        list.add("uday");
        list.add("ravi");
        list.add("chandu");
        list.add("amma");
        list.add("ravi");
        list.add("akka");
        list.add("chotu");
        Map m1=new HashMap<>();
        for(Object obj:list){
            if (m1.containsKey(obj)){
                Object count=m1.get(obj);
                Integer i=(Integer)count;
                i=i+1;
                m1.put(obj,i);

            }else {
                m1.put(obj,1);

            }
        }
        Set s=m1.keySet();
            for (Object obj1:s){
            Object output=m1.get(obj1);
            Integer k=(Integer)output;
            if (k>1){
                System.out.println(obj1);
            }
        }
    }

}
