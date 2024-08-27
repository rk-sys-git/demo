package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Japan {
    public static void main(String[] args) {


        List a = new ArrayList<>();
        a.add("ravi");
        a.add("kumar");
        Iterator it=a.iterator();
        while (it.hasNext()){
            Object obj=it.next();
            System.out.println(obj);
        }


    }
}