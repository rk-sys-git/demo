package MapExamples;

import java.util.*;

public class ImplementPassword {
    public static void main(String[]args) {
        Pincode pincode = new Pincode();
        pincode.setHouseno(100);
        pincode.setCity("amalapuram");
        pincode.setGodavari("east");
        pincode.setStreet("kamsalcolony");

        Pincode pincode1 = new Pincode();
        pincode1.setHouseno(200);
        pincode1.setCity("tanuku");
        pincode1.setGodavari("west");
        pincode1.setStreet("buststand road");

        Pincode pincode2 = new Pincode();
        pincode2.setHouseno(300);
        pincode2.setCity("vijayawada");
        pincode2.setStreet("autonagar");
        pincode2.setGodavari("krishna");

        List<Pincode> list = new ArrayList();
        list.add(pincode);
        list.add(pincode1);
        list.add(pincode2);

        Map m1 = new HashMap<>();
        for (Object obj : list) {
            Pincode p1 = (Pincode) obj;
            m1.put(p1.getCity(), p1);
        }
        Set s = m1.keySet();
        for (Object obj1 : s) {
            String s1 = (String) obj1;
            Object value = m1.get(s1);
            Pincode p2 = (Pincode) value;
            System.out.println(p2.getCity());
            System.out.println(p2.getGodavari());
            System.out.println(p2.getHouseno());
            System.out.println(p2.getStreet());


        }
    }}

