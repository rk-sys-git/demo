package Typecast;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeClass {
    public static void main(String[]args){
        List<User>l1=new ArrayList();
        User u1=new User();
        u1.setFirstName("uday");
        u1.setLastName("kumar");
        User u2=new User();
        u2.setLastName("kumar");
        u2.setFirstName("Ravi");
        l1.add(u1);
        l1.add(u2);
        Iterator xl= l1.iterator();
        while(xl.hasNext()){
            Object os=xl.next();
            User u=(User) os;
            System.out.println(u.getFirstName());
            System.out.println(u.getLastName());
        }

    }
}
