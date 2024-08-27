package SetExamplesComparable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Mainseter {
    public static void main(String[]args){
        Student student1=new Student();
        student1.setId(100);
        student1.setName("ravi");
        student1.setAge(28);
        Student student2=new Student();
        student2.setId(200);
        student2.setName("uday");
        student2.setAge(32);
        Student student3=new Student();
        student3.setId(100);
        student3.setName("ravi");
        student3.setAge(28);
        List<Student> studentList=new ArrayList<>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
Set<Student> newset=new HashSet<>();
        for (Student stu:studentList){
            Boolean a=newset.add(stu);
            if (a){
                System.out.println(stu.getId());
                System.out.println(stu.getName());
                System.out.println(stu.getAge());
                System.out.println("-------------------------");
               System.out.println(a);
            }
        }
    }
}
