package MapNewExamples;

import java.util.*;

public class ImplStudentData {
    public static void main(String[]args){
        List<String> stringList=new ArrayList<>();
        stringList.add("telugu");
        stringList.add("hindhi");
        stringList.add("maths");
        stringList.add("english");

        StudentData studentData=new StudentData();
        studentData.setId(10);
        studentData.setName("ravi");
      studentData.setSubjects(stringList);

        StudentData studentData1=new StudentData();
        studentData1.setId(20);
        studentData1.setName("uday");
        studentData1.setSubjects(stringList);

        StudentData studentData2=new StudentData();
        studentData2.setId(10);
        studentData2.setName("kumar");
        studentData2.setSubjects(stringList);

        Map<String,Integer> m1=new HashMap<>();
        m1.put("telugu",90);
        m1.put("hindhi",75);
        m1.put("english",85);
        m1.put("maths",99);

        Map<String,Integer> m2=new HashMap<>();
        m2.put("telugu",91);
        m2.put("hindhi",65);
        m2.put("english",75);
        m2.put("maths",89);

        Map<String,Integer> m3=new HashMap<>();
        m3.put("telugu",79);
        m3.put("hindhi",65);
        m3.put("english",75);
        m3.put("maths",91);

        studentData.setMarks(m1);
        studentData1.setMarks(m2);
        studentData2.setMarks(m3);
        List<StudentData> studentDataList=new ArrayList<>();
        studentDataList.add(studentData);
        studentDataList.add(studentData1);
        studentDataList.add(studentData2);
        System.out.println("--------------------------------------------------------");
        for (StudentData sk:studentDataList){
            System.out.println("----------------------------------------------------");
            System.out.println(sk.getId());
            System.out.println(sk.getName());
            Map<String,Integer> m5=studentData.getMarks();
            Set<String> s3=m5.keySet();
            for(String su:s3){
               System.out.println(m5.get(su));
            }
            List<String> stringList1=studentData.getSubjects();
                for (String so:stringList1){
                    System.out.println(so);
                }
            }
        }



        }







