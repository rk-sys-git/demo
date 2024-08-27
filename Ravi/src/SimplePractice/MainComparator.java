package SimplePractice;

import java.util.Set;
import java.util.TreeSet;

public class MainComparator {
    public static void main(String[]args){
        Set s=new TreeSet(new StringComparator());
        s.add("ravi");
        s.add("kumar");
        s.add("xyzer");
        s.add("amalapuram");
        s.add("abc");
        s.add("znm");
        for (Object obj:s){
            System.out.println(obj);
        }
    }
}
