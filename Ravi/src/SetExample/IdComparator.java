package SetExample;

import java.util.Comparator;

public class IdComparator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Student a=(Student) obj1;
        Student b=(Student) obj2;
        if ((a.getId() < b.getId())) {

            return -1;
        } else if (a.getId()>b.getId()) {
            return +1;

        }else {
            return 0;
        }

    }

}
