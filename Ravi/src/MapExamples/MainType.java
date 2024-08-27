package MapExamples;

import java.util.*;

public class MainType {
    public static void main(String[]args){


        TypeSaftyexp tc1 = new TypeSaftyexp();
        tc1.setId(100);
        tc1.setName("ravi");
        tc1.setCity("hyd");

        TypeSaftyexp tc2 = new TypeSaftyexp();
        tc2.setId(200);
        tc2.setName("kalyan");
        tc2.setCity("chennai");

        TypeSaftyexp tc3 = new TypeSaftyexp();
        tc3.setId(300);
        tc3.setName("uday");
        tc3.setCity("amp");

        List la=new ArrayList<>();
        la.add(tc1);
        la.add(tc2);
        la.add(tc3);
        Map m1=new HashMap();
        for (Object o1:la) {
            TypeSaftyexp typeSaftyexp= (TypeSaftyexp)o1;
            m1.put(typeSaftyexp.getId(), typeSaftyexp);
        }
            Set s=m1.keySet();
            for(Object o2:s){
               Integer in=(Integer)o2;
               Object value=m1.get(in);
               TypeSaftyexp tpy=(TypeSaftyexp)value;
               System.out.println(tpy.getId());
                System.out.println(tpy.getName());
                System.out.println(tpy.getCity());
            }
        }


    }
