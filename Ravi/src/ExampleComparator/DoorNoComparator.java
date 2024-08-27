package ExampleComparator;

import java.util.Comparator;

public class DoorNoComparator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Address address1=(Address) obj1;
        Address address2=(Address) obj2;
        return (address1.getDoorNo().compareTo(address2.getDoorNo()));
    }
}
