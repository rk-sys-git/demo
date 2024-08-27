package Collectionexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Retrivfe {
    public static void main(String[]args){
        List<String> l=new ArrayList();
        //l.add(100);//
        l.add("uday");
       // l.add(true);//
        Iterator itr= l.iterator();
        while(itr.hasNext())
        {
            Object obj = itr.next();
            System.out.println(obj);
        }
    }
}
