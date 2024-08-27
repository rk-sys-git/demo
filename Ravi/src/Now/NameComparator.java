package Now;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Student student1=(Student) obj1;
        Student student2=(Student) obj2;
        return (student1.getName().compareTo(student2.getName()));
    }
}
