package SetExamplesComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainTeacher {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.setId(1);
        teacher.setName("ravi");
        teacher.setAge(26);

        Teacher teacher1=new Teacher();
        teacher1.setId(4);
        teacher1.setName("kumar");
        teacher1.setAge(30);

        Teacher teacher2=new Teacher();
        teacher2.setId(7);
        teacher2.setName("uday");
        teacher2.setAge(32);

        List<Teacher> teacherList=new ArrayList<>();
teacherList.add(teacher);
teacherList.add(teacher1);
teacherList.add(teacher2);
        Collections.sort(teacherList);
        for (Teacher teacher3:teacherList){
            System.out.println(teacher3.getId());
            System.out.println(teacher3.getName());
            System.out.println(teacher3.getAge());
        }
    }
}
