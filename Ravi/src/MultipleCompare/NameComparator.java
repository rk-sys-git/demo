package MultipleCompare;

import ExampleComparator.Address;

import java.util.Comparator;

public class NameComparator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Address address1=(Address) obj1;
        Address address2=(Address) obj2;
        return (address1.getName().compareTo(address2.getName()));
    }

}
