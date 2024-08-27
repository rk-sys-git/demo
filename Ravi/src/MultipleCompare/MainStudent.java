package MultipleCompare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student();
        student.setId(100);
        student.setAge(28);
        student.setName("ravi");

        Student student1 = new Student();
        student1.setId(200);
        student1.setName("uday");
        student1.setAge(30);

        Student student2 = new Student();
        student2.setId(300);
        student2.setName("kumar");
        student2.setAge(25);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);

        Scanner s=new Scanner(System.in);
        System.out.println("enter column Name to Sort");
        String input=s.nextLine();

        if (input.equals("Id")){
            Collections.sort(studentList,new IdComparator());
        } else if (input.equals("Name")) {
            Collections.sort(studentList,new NameComparator());

        } else if (input.equals("Age")) {
            Collections.sort(studentList,new AgeComparator());

        }

        for (Student student3 : studentList) {
System.out.println("------------------------------------------------------------------");
            System.out.println(student3.getId());
            System.out.println(student3.getName());
            System.out.println(student3.getAge());
        }
    }
}
