package StudentPackege;

import java.util.ArrayList;
import java.util.List;

public class MainStudent {
    public static void main(String[] args) {

        Student s = new Student();
        s.setId(1);
        s.setName("ravi");
        s.setAge(28);

        Address a1 = new Address();
        a1.setDno("10-38");
        a1.setStreet("kamsal colony");
        a1.setCity("hyd");
        a1.setCountry("telegana");
        a1.setPincode("53322");

        s.setAddress(a1);

        Student s1 = new Student();
        s1.setId(2);
        s1.setName("udy");
        s1.setAge(30);

        Address a2 = new Address();
        a2.setDno("207");
        a2.setStreet("kamsal colony");
        a2.setCity("amp");
        a2.setCountry("andhra");
        a2.setPincode("533201");
        s1.setAddress(a2);

        Student s3 = new Student();
        s3.setId(1);
        s3.setName("ravi");
        s3.setAge(28);
        Address a3 = new Address();
        a3.setDno("11-38");
        a3.setStreet("colony");
        a3.setCity("chennai");
        a3.setCity("ban");
        a3.setCountry("tami");
        a3.setPincode("5000097");
        s3.setAddress(a3);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s);
        studentList.add(s1);
        studentList.add(s3);
        for (Student st : studentList) {


            Address aw = st.getAddress();
            if ((aw.getCity().equalsIgnoreCase("ban"))) {
                System.out.println(st.getId());
                System.out.println(st.getName());
                System.out.println(st.getAge());
                System.out.println(aw.getDno());
                System.out.println(aw.getStreet());
                System.out.println(aw.getCity());
                System.out.println(aw.getCountry());
                System.out.println(aw.getPincode());
                System.out.println("--------------------------------");


            }
        }
    }
}