package Collection;

import java.util.ArrayList;

public class List {
    public static void main(String[]args){
        java.util.List list=new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(true);
        list.add("uday");
        for (Object o:list){
            System.out.println(o);
        }
        Integer i=list.size();
        System.out.println("=----------------------------------------------");
        System.out.println(i);
        Boolean s=list.contains("ravi");
        System.out.println("=----------------------------------------------");
        System.out.println(s);
        Object o1=list.get(2);
        System.out.println("=----------------------------------------------");
        System.out.println(o1);
    }
}
