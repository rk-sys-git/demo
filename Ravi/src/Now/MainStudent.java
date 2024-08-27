package Now;

import java.util.Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MainStudent {
    public static void main(String[]args){
        Student student1=new Student();
        student1.setAge(25);
        student1.setName("ravi");
        student1.setId(10);

        Student student2=new Student();
        student2.setAge(28);
        student2.setName("uday");
        student2.setId(20);

        Student student3=new Student();
        student3.setAge(30);
        student3.setName("kumar");
        student3.setId(30);

        Student student4=new Student();
        student4.setAge(45);
        student4.setName("satya");
        student4.setId(35);

        Set<Student> studentSet = null;
        Scanner s=new Scanner(System.in);
        System.out.println("enter column name to sort");
        String input=s.nextLine();
        if(input.equals("id")){
            studentSet=new TreeSet<>(new IdComparator());
        }else if(input.equals("name")){
            studentSet=new TreeSet<>(new NameComparator());
        } else if (input.equals("age")) {
            studentSet=new TreeSet<>(new AgeComparator());

        }
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        for (Student saw:studentSet){
            System.out.println(saw.getId());
            System.out.println(saw.getName());
            System.out.println(saw.getAge());
        }

    }
}
