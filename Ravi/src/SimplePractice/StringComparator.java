package SimplePractice;

import java.util.Comparator;

public class StringComparator implements Comparator {
    @Override
    public int compare(Object o1,Object o2){
        String a=(String) o1;
        String b=(String) o2;
       return -(a.compareTo(b));
    }
}
