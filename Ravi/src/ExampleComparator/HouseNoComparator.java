package ExampleComparator;

import java.util.Comparator;

public class HouseNoComparator implements Comparator {
    @Override
    public int compare(Object obj1,Object obj2){
        Address address1=(Address) obj1;
        Address address2=(Address) obj2;
        if (address1.getHouseNo()>address2.getHouseNo()){
            return +1;
        } else if (address1.getHouseNo()<address2.getHouseNo()) {
            return -1;

        }else {
            return 0;
        }

    }
}
