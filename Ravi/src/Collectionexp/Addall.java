package Collectionexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Addall {
    public static void main(String[]args){
        List<String> list1=new ArrayList();
        list1.add("kakinada");
        list1.add("amalapuram");
        list1.add("rajahmundry");
        list1.add("yanam");
        List<String> list2=new ArrayList<>();
        list2.add("tanuku");
        list2.add("eluru");
        list2.add("gudiwada");
        list2.add("bhimavaram");
        list1.addAll(list2);
        Iterator ite=list1.iterator();
        while (ite.hasNext()){
            Object obj=ite.next();
            String s=(String) obj;
            if(s.length()<=5) {
                System.out.println(obj);
            }
        }
    }
}
