package Collectionexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Retriveexp {
    public static void main(String[]args){
        List<String> l= new ArrayList();
       /* l.add("amalapuramj");
        l.add("rajamjundry");
        l.add("kakinada");
        l.add(null);
        l.add("razole");
        l.add("ravulapalemj");
        l.add(null);
         l.add("      ");
        l.add("l");
        l.add("vijayawada");
        l.add(null);
        l.add("chennai");*/
        System.out.println(l.size());
        System.out.println(l.isEmpty());
        Iterator ite= l.iterator();
        while (ite.hasNext()){
            Object ott=ite.next();
            String s=(String) ott;
           // if(s.length()<10) {//
                System.out.println(ott);
           // }//
        }
    }
}
