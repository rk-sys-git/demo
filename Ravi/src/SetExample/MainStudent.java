package SetExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainStudent {
    public static void main(String[]args){
        Student student=new Student();
        student.setName("ravi");
        student.setId(100);
        student.setAge(25);

        Student student1=new Student();
        student1.setName("kalyan");
        student1.setId(102);
        student1.setAge(28);

        Student student2=new Student();
        student2.setName("ram");
        student2.setId(99);
        student2.setAge(27);

        Student student3=new Student();
        student3.setName("pawan");
        student3.setId(104);
        student3.setAge(26);

        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);

        Scanner scanner=new Scanner(System.in);
        System.out.println("print enter comparator");
        String value=scanner.nextLine();

        if (value.equals("id")){
            Collections.sort(studentList,new IdComparator());

        } else if (value.equals("name")) {
           Collections.sort(studentList,new NameComparator());
        } else if (value.equals("age")) {
            Collections.sort(studentList,new AgeComparator());
        }

        for (Student student4:studentList){
            System.out.println(student4.getId());
            System.out.println(student4.getName());
            System.out.println(student4.getAge());
        }
    }
}
