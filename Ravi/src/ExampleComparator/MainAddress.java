package ExampleComparator;

import MultipleCompare.NameComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainAddress {
    public static void main(String[] args) {
        Address address = new Address();
address.setName("ravi");
address.setHouseNo(100);
address.setCity("amalapuram");
address.setStreet("kamsalcolony");
address.setDoorNo("10-32");

        Address address1 = new Address();
        address1.setName("kumar");
        address1.setHouseNo(200);
        address1.setCity("tirupathi");
        address1.setStreet("ramnagar");
        address1.setDoorNo("110-132");

        Address address2 = new Address();
        address2.setName("uday");
        address2.setHouseNo(150);
        address2.setCity("kakinada");
        address2.setStreet("sriramapuram");
        address2.setDoorNo("2-54");
        List<Address> addressList=new ArrayList<>();
        addressList.add(address);
        addressList.add(address1);
        addressList.add(address2);

        Scanner s=new Scanner(System.in);
        System.out.println("enter column name to sort");
        String input=s.nextLine();

        if(input.equals("name")){
            Collections.sort(addressList,new NameComparator());
        } else if (input.equals("city")) {
            Collections.sort(addressList,new CityComparator());

        } else if (input.equals("doorno")) {
            Collections.sort(addressList,new DoorNoComparator());

        } else if (input.equals("steet")) {
            Collections.sort(addressList,new StreetComparator());

        } else if (input.equals("houseno")) {
            Collections.sort(addressList,new HouseNoComparator());

        }
        for(Address address3:addressList){
            System.out.println(address3.getName());
            System.out.println(address3.getCity());
            System.out.println(address3.getDoorNo());
            System.out.println(address3.getStreet());
            System.out.println(address3.getHouseNo());
        }


    }
}