package MapNewExamples;

import java.util.*;

public class ImplementStudent1 {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(100);
        student.setName("ravi");
        student.setCity("amalapuram");
        student.setDistict("east");

        Student student1 = new Student();
        student1.setId(200);
        student1.setName("kumar");
        student1.setCity("amalapuram");
        student1.setDistict("west");

        Student student2 = new Student();
        student2.setId(230);
        student2.setName("kalyan");
        student2.setCity("chennai");
        student2.setDistict("westthambaram");

        Student student3 = new Student();
        student3.setId(400);
        student3.setName("rudra");
        student3.setCity("Chennai");
        student3.setDistict("velachery");

        Student student4 = new Student();
        student4.setId(200);
        student4.setName("kumar");
        student4.setCity("amalapuram");
        student4.setDistict("west");

        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Map<String, List<Student>> m1 = new HashMap<>();

        for (Student sq : studentList) {
            if ((m1.containsKey(sq.getCity()))) {
                List<Student> list5 = m1.get(sq.getCity());
                list5.add(sq);
            } else {
                List<Student> list12 = new ArrayList<>();
                list12.add(sq);
                m1.put(sq.getCity(), list12);


            }
        }
        Set<String> s2 = m1.keySet();
        for (String str : s2) {
            System.out.println("__________________________________________________");
            List<Student> studentList1 = m1.get(str);
            for (Student obj : studentList1) {

                System.out.println(obj.getId());
                System.out.println(obj.getName());
                System.out.println(obj.getDistict());
                System.out.println(obj.getCity());

            }
        }
    }
}
