package SetExamplesComparable;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[]args){
        Student s1=new Student();
        s1.setId(100);
        s1.setName("ravi");
        s1.setAge(25);

        Student s2=new Student();
        s2.setId(200);
        s2.setName("kumar");
        s2.setAge(28);

        Student s3=new Student();
        s3.setId(100);
        s3.setName("ravi");
        s3.setAge(25);

        Set<Student> se=new HashSet<>();
        se.add(s1);
        se.add(s2);
        se.add(s3);
        for (Student stu:se){

            System.out.println(stu.getId());
            System.out.println(stu.getName());
            System.out.println(stu.getAge());
        }
    }
}
