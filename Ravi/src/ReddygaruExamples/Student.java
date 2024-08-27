package ReddygaruExamples;

public class Student implements Comparable<Student>{
    Integer rollNo;
    String studentName;
    String course;
    String examination;
    int english;
    int telugu;
    int social;
    int science;
    int maths;
    int hindhi;


    Student(Integer rollNo,String studentName,String course,String examination,
            int english,int telugu,int social,int science,int maths,int hindhi) {
        this.rollNo = rollNo;
        this.studentName = studentName;
        this.course = course;
        this.examination = examination;
        this.english = english;
        this.telugu = telugu;
        this.hindhi = hindhi;
        this.science = science;
        this.social = social;
        this.maths = maths;

    }

    @Override
    public int compareTo(Student s) {
        return -this.studentName.compareTo(s.studentName);
    }
}
