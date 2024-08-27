package Collectionexp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SchoolRetrive {
    public static void main(String[]args){
        List<School> l=new ArrayList();
        School s=new School();
        s.setName("kalyan");
        s.setId(330);
        s.setAge(28);
        School s1=new School();
        s1.setName("Chiru");
        s1.setAge(25);
        s1.setId(333);
        School s2=new School();
        s2.setName("pawan");
        s2.setId(444);
        s2.setAge(28);
        School s3=new School();
        s3.setName("ramcdharan");
        s3.setId(338);
        s3.setAge(29);
        School s4=new School();
        s4.setName("Prabhas");
        s4.setId(332);
        s4.setAge(28);
        School s5=new School();
        s5.setName("allu");
        s5.setId(338);
        s5.setAge(33);
        l.add(s);
        l.add(s1);
        l.add(s2);
        l.add(s3);
        l.add(s4);
        l.add(s5);
        Iterator ite= l.iterator();
        while (ite.hasNext()){
            Object ot=ite.next();
            School y=(School) ot;
            System.out.println("--------------------------------------------------------");
            if(y.getAge()<45) {
                System.out.println(y.getName());
                System.out.println(y.getId());
                System.out.println(y.getAge());

            }else {
                System.out.println("no emjplyoes");
            }
        }
    }
}
