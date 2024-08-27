package MultipleCompare;

import java.util.Comparator;

public class IdComparator implements Comparator {
    @Override
    public int compare(Object obj1, Object obj2) {
        Student student1 = (Student) obj1;
        Student student2 = (Student) obj2;
        if (student1.getId() < student2.getId()) {
            return +1;
        } else if (student1.getId() < student2.getId()) {
            return -1;
        } else {
            return 0;
        }
    }
}
