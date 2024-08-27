package StudentPackege;

import java.util.ArrayList;
import java.util.List;

public class MainPerson {

    public static void main(String[]args){
        Person p1=new Person();
        p1.setId(1);
        p1.setName("ravi");
        Address a1=new Address();
        a1.setDno("10-90");
        a1.setStreet("kam");
        a1.setCity("amp");
        a1.setPincode("533201");
        a1.setCountry("andhra");

        Address a2=new Address();
        a2.setDno("207");
        a2.setCountry("tamil");
        a2.setPincode("500097");
        a2.setStreet("secrertery");
        a2.setCity("chennai");

        List<Address> l1=new ArrayList<>();
        l1.add(a1);
        l1.add(a2);

        p1.setAddressList(l1);



        Person p2=new Person();
        p2.setId(2);
        p2.setName("uday");
        Address a3=new Address();
        a3.setDno("1119");
        a3.setStreet("suram");
        a3.setCity("hyd");
        a3.setPincode("2000");
        a3.setCountry("telagana");

        Address a4=new Address();
        a4.setDno("ban");
        a4.setCountry("karna");
        a4.setPincode("700097");
        a4.setStreet("marathahalli");
        a4.setCity("bangalore");

        List<Address> list2=new ArrayList<>();
        list2.add(a3);
        list2.add(a4);
        p2.setAddressList(list2);

        List<Person> personList=new ArrayList<>();
        personList.add(p1);
        personList.add(p2);

        for (Person p:personList){
            System.out.println("-----------------------------------");
            System.out.println(p.getId());
            System.out.println(p.getName());
            List<Address> addressList=p.getAddressList();
            for (Address a:addressList){
                System.out.println("==========");
                System.out.println(a.getCity());
                System.out.println(a.getStreet());
                System.out.println(a.getDno());
                System.out.println(a.getCountry());
                System.out.println(a.getPincode());
            }
        }


    }
}
