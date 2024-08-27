package SetExample;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
public int compare(Object obj1,Object obj2){
    Student student=(Student) obj1;
    Student student1=(Student) obj2;
   return student.getName().compareTo(student1.getName());

}
}
