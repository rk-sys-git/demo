package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TypeClass {
    public static void main(String[]args){
        User u=new User();
        u.setFirstName("ravi");
        u.setLastName("kumar");
        User u2=new User();
        u2.setFirstName("uday");
        u2.setLastName("kumar");
        List<User> l1=new ArrayList<>();
        l1.add(u);
        l1.add(u2);

        Iterator itr=l1.iterator();
        while (itr.hasNext()){
            Object as=itr.next();
            User cd=(User) as;

            System.out.println(cd.getFirstName());
            System.out.println(cd.getLastName());
        }
    }
}
