package MapNewExamples;

import java.util.*;

public class ImplementStudent {
    public static void main(String[]args){
        Student student=new Student();
        student.setId(100);
        student.setCity("kakinada");
        student.setName("ramkumar");
        student.setDistict("Eastgodavari");

        Student student1=new Student();
        student1.setId(200);
        student1.setName("udaykumar");
        student1.setCity("vijayawada");
        student1.setDistict("krishna");

        Student student2=new Student();
        student2.setId(300);
        student2.setName("chandu");
        student2.setDistict("westgodavari");
        student2.setCity("tadepalligudem");

        List<Student> studentList=new ArrayList<>();
        studentList.add(student);
        studentList.add(student1);
        studentList.add(student2);
        Map<String,Student> m1=new HashMap<>();
        for (Student o1:studentList){

            m1.put(o1.getName(),o1);

        }
        Set<String> s1=m1.keySet();
        for (String str:s1){
            Student ser=m1.get(str);
            System.out.println("------------------------------------------------");
            System.out.println(ser.getId());
            System.out.println(ser.getName());
            System.out.println(ser.getCity());
            System.out.println(ser.getDistict());
        }

    }
}
