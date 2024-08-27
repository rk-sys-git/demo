package SetExamplesComparable;

import java.util.*;

public class MainStudent {
    public static void main(String[]args) {
        Set<Student> studentSet = new HashSet<>();
        Student student = new Student();
        student.setId(1);
        student.setName("ravi kumar");
        student.setAge(28);


        Student student1 = new Student();
        student1.setId(5);
        student1.setName("harsha");
        student1.setAge(25);

        Student student2 = new Student();
        student2.setId(3);
        student2.setName("kumar");
        student2.setAge(27);
        studentSet.add(student);
        studentSet.add(student1);
        studentSet.add(student2);

        List<Student> list = new ArrayList<>(studentSet);
        Collections.sort(list);
        for (Student student3 : studentSet) {
            System.out.println("---------------------------------------------");
            System.out.println(student3.getId());
            System.out.println(student3.getName());
            System.out.println(student3.getAge());

        }
    }
}
