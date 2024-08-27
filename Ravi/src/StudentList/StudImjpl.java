package StudentList;

import java.util.ArrayList;
import java.util.List;

public class StudImjpl implements Stuintr {
    @Override
    public List<Student> StudentDetails() {
        List<Student> lr = new ArrayList();
        Student s = new Student();
        s.setId(1234);
        s.setName("ravi");
        String[] a = new String[5];
        a[0] = "telugu";
        a[1] = "english";
        a[2] = "tamil";
        s.setLanguages(a);
        AddImpl ad = new AddImpl();
        Address e = ad.creatadd();
        s.setAddress(e);
        lr.add(s);
        return lr;
    }

    @Override
    public void display(List<Student> ls) {
        for (Student u : ls) {
            System.out.println(u.getId());
            System.out.println(u.getName());
            String[] lan = u.getLanguages();

            {
                for (int i = 0; i < lan.length; i++) {
                    System.out.println(lan[i]);
                }
                Address ak= u.getAddress();
                System.out.println(ak.getDoornumber());
                System.out.println(ak.getStreet());
                System.out.println(ak.getCity());
                System.out.println(ak.getCountry());
                System.out.println(ak.getPincode());
                System.out.println(ak.getState());
            }

        }
    }
}