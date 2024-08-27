package PkSet;

import java.util.HashSet;
import java.util.Set;

public class ImplementStudent implements Inter{
    @Override
    public Set<Student> create(){
        Student student=new Student();
        Set<Student> students=new HashSet();
        student.setId(100);
        student.setName("ravi kumar");
        student.setCity("amalapuram");
        student.setStandard(12);

        Student student1=new Student();
        student1.setId(100);
        student1.setName("ravi kumar");
        student1.setName("ravi kumar");
        student1.setCity("amalapuram");
        student1.setStandard(12);
        students.add(student);
        students.add(student1);
        return students;
    }
    @Override
    public void display(Set<Student> ol){
        for (Student st:ol){
            System.out.println(st.getId());
            System.out.println(st.getName());
            System.out.println(st.getCity());
            System.out.println(st.getStandard());
        }

    }

}
