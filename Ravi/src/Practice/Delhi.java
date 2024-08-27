package Practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Delhi {
    public static void main(String[]args){
        Object oi;
        List kl=new ArrayList<>();
        kl.add("kumar");
        kl.add("uday");
        kl.add("bsr");
        Iterator iu= kl.iterator();
        while (iu.hasNext()){
            Object obj=iu.next();
            System.out.println(obj);

        }
    }
}
