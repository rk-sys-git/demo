package ReddygaruExamples;

import java.util.*;

public class MyStudent {
    public static void main(String[] args) {


        List<Student> studentList = new ArrayList<>();
        Student se = new Student(101, "ravi", "cbsc", "unit-1", 97, 98, 85,
                82, 65, 89);


        Student se1 = new Student(101, "ravi", "cbsc", "unit-2", 95, 87, 85, 89, 78, 99);


        Student se2 = new Student(101, "ravi", "cbsc", "unit-3", 91, 85, 79, 87, 92, 93);


        Student se3 = new Student(101, "ravi", "cbsc", "Quaterly", 90, 85, 74, 87, 91, 93);


        Student se4 = new Student(101, "ravi", "cbsc", "half-yearly", 89, 85, 79, 77, 92, 84);


        Student se5 = new Student(101, "ravi", "cbsc", "Aunyearly", 81, 85, 79, 87, 72, 73);


        Student se6 = new Student(102, "uday", "ic", "unit-1", 77, 98, 85,
                62, 75, 89);


        Student se7 = new Student(102, "uday", "ic", "unit-2", 85, 87, 75, 89, 88, 89);


        Student se8 = new Student(102, "uday", "ic", "unit-3", 81, 75, 89, 77, 92, 93);


        Student se9 = new Student(102, "uday", "ic", "Quaterly", 80, 85, 84, 77, 81, 83);


        Student se10 = new Student(102, "uday", "ic", "half-yearly", 79, 95, 79, 87, 92, 74);


        Student se11 = new Student(102, "uday", "ic", "Aunyearly", 81, 75, 79, 87, 82, 83);


        Student se12 = new Student(103, "chotu", "ic", "unit-1", 87, 98, 85,
                62, 75, 89);


        Student se13 = new Student(103, "chotu", "ic", "unit-2", 85, 87, 85, 89, 88, 89);


        Student se14 = new Student(103, "chotu", "ic", "unit-3", 91, 75, 79, 77, 92, 93);


        Student se15 = new Student(103, "chotu", "ic", "Quaterly", 90, 85, 74, 87, 81, 73);


        Student se16 = new Student(103, "chotu", "ic", "half-yearly", 89, 85, 79, 87, 92, 84);


        Student se17 = new Student(103, "chotu", "ic", "Aunyearly", 81, 85, 79, 97, 82, 83);


        Student se18 = new Student(104, "raji", "ic", "unit-1", 87, 98, 85,
                62, 75, 89);


        Student se19 = new Student(104, "raji", "ic", "unit-2", 95, 87, 75, 89, 78, 89);


        Student se20 = new Student(104, "raji", "ic", "unit-3", 91, 75, 79, 77, 92, 83);


        Student se21 = new Student(104, "raji", "ic", "Quaterly", 80, 75, 84, 77, 81, 83);


        Student se22 = new Student(104, "raji", "ic", "half-yearly", 79, 85, 69, 87, 82, 74);


        Student se23 = new Student(104, "raji", "ic", "Aunyearly", 91, 85, 89, 87, 72, 73);


        Student se24 = new Student(105, "pk", "cbsc", "unit-1", 87, 98, 85,
                62, 75, 89);


        Student se25 = new Student(105, "pk", "cbsc", "unit-2", 85, 87, 85, 79, 78, 79);


        Student se26 = new Student(105, "pk", "cbsc", "unit-3", 91, 75, 89, 87, 82, 73);


        Student se27 = new Student(105, "pk", "cbsc", "Quaterly", 90, 75, 74, 77, 91, 73);


        Student se28 = new Student(105, "pk", "cbsc", "half-yearly", 79, 75, 69, 77, 82, 84);


        Student se29 = new Student(105, "pk", "cbsc", "Aunyearly", 81, 85, 79, 77, 72, 83);
        studentList.add(se1);
        studentList.add(se2);
        studentList.add(se3);
        studentList.add(se4);
        studentList.add(se5);
        studentList.add(se6);
        studentList.add(se7);
        studentList.add(se8);
        studentList.add(se9);
        studentList.add(se10);
        studentList.add(se11);
        studentList.add(se12);
        studentList.add(se13);
        studentList.add(se14);
        studentList.add(se15);
        studentList.add(se16);
        studentList.add(se17);
        studentList.add(se18);
        studentList.add(se19);
        studentList.add(se20);
        studentList.add(se21);
        studentList.add(se22);
        studentList.add(se23);
        studentList.add(se24);
        studentList.add(se25);
        studentList.add(se26);
        studentList.add(se27);
        studentList.add(se28);
        studentList.add(se29);
        Map<Integer, List<Student>> m1 = new HashMap<>();
        Collections.sort(studentList);
        for (Student stu : studentList) {
            if (m1.containsKey(stu.rollNo)) {
                List<Student> studentList3 = m1.get(stu.rollNo);
                studentList3.add(stu);
            } else {
                List<Student> studentList2 = new ArrayList<>();
                studentList2.add(stu);
                m1.put(stu.rollNo, studentList2);
            }
        }

        Set<Integer> s1 = m1.keySet();
        List<Student> students = new ArrayList<>();
        for (Integer ind : s1) {
            students.addAll(m1.get(ind));
        }
        Collections.sort(students);
        int count = 0;
        String ne = null;
        String ve = null;
        for(Student out:students){

            if(count != out.rollNo) {
                System.out.println("rollnumber  =" + out.rollNo);
            }
            count = out.rollNo;

            if (ne==null || !ne.equals(out.studentName)) {
                System.out.println("StudentName  =" + out.studentName);
            }
            ne=out.studentName;
            if (ve==null || !ve.equals(out.course)) {
                System.out.println("course  =" + out.course);
            }
            ve=out.course;
        }
    }
}
