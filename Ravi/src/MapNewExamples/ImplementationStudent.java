package MapNewExamples;

import java.util.*;

public class ImplementationStudent {
    public static void main(String[] args) {
        StudentMarks studentMarks = new StudentMarks();
        studentMarks.setId("100");
        studentMarks.setName("ravi");
        studentMarks.setPercentage(75);
        studentMarks.setRank(12);

        StudentMarks studentMarks1 = new StudentMarks();
        studentMarks1.setId("109");
        studentMarks1.setName("uday");
        studentMarks1.setPercentage(90);
        studentMarks1.setRank(4);

        StudentMarks studentMarks2 = new StudentMarks();
        studentMarks2.setId("102");
        studentMarks2.setName("kishore");
        studentMarks2.setPercentage(55);
        studentMarks2.setRank(67);

        StudentMarks studentMarks3 = new StudentMarks();
        studentMarks3.setId("125");
        studentMarks3.setName("chandu");
        studentMarks3.setPercentage(69);
        studentMarks3.setRank(67);

        StudentMarks studentMarks4 = new StudentMarks();
        studentMarks4.setId("150");
        studentMarks4.setName("kavya");
        studentMarks4.setPercentage(53);
        studentMarks4.setRank(212);

        StudentMarks studentMarks5 = new StudentMarks();
        studentMarks5.setId("148");
        studentMarks5.setName("mani");
        studentMarks5.setPercentage(93);
        studentMarks5.setRank(2);

        StudentMarks studentMarks6 = new StudentMarks();
        studentMarks6.setId("29");
        studentMarks6.setName("kalyan");
        studentMarks6.setPercentage(89);
        studentMarks6.setRank(18);


        StudentMarks studentMarks7 = new StudentMarks();
        studentMarks7.setId("113");
        studentMarks7.setName("vijaya");
        studentMarks7.setPercentage(97);
        studentMarks7.setRank(1);

        StudentMarks studentMarks8 = new StudentMarks();
        studentMarks8.setId("228");
        studentMarks8.setName("chotu");
        studentMarks8.setPercentage(92);
        studentMarks8.setRank(7);

        StudentMarks studentMarks9 = new StudentMarks();
        studentMarks9.setId("229");
        studentMarks9.setName("harsha");
        studentMarks9.setPercentage(53);
        studentMarks9.setRank(121);

        StudentMarks studentMarks11 = new StudentMarks();
        studentMarks11.setId("229");
        studentMarks11.setName("harsha");
        studentMarks11.setPercentage(36);
        studentMarks11.setRank(121);

        List<StudentMarks> studentMarksList = new ArrayList<>();
        studentMarksList.add(studentMarks);
        studentMarksList.add(studentMarks1);
        studentMarksList.add(studentMarks2);
        studentMarksList.add(studentMarks3);
        studentMarksList.add(studentMarks4);
        studentMarksList.add(studentMarks5);
        studentMarksList.add(studentMarks6);
        studentMarksList.add(studentMarks7);
        studentMarksList.add(studentMarks8);
        studentMarksList.add(studentMarks9);
        studentMarksList.add(studentMarks11);

        Map<String, List<StudentMarks>> m1 = new HashMap<>();

        for (StudentMarks studentMarks10 : studentMarksList) {
            Integer i = studentMarks10.getPercentage();
            if (i > 60) {
                if (m1.containsKey("First class")) {
                    List<StudentMarks> studentMarksList2 = m1.get("First class");
                    studentMarksList2.add(studentMarks10);
                } else {
                    List<StudentMarks> studentMarksList1 = new ArrayList<>();
                    studentMarksList1.add(studentMarks10);
                    m1.put("First class", studentMarksList1);
                }
            }
             else if (i > 50 && i < 60) {
                    if (m1.containsKey("Secound class")) {
                        List<StudentMarks> studentMarksList4 = m1.get("Secound class");
                        studentMarksList4.add(studentMarks10);

                    } else {
                        List<StudentMarks> studentMarksList3 = new ArrayList<>();
                        studentMarksList3.add(studentMarks10);
                        m1.put("Secound class", studentMarksList3);
                    }

                } else if (i < 50 && i > 35) {
                    if (m1.containsKey("third class")) {
                        List<StudentMarks> studentMarksList6 = m1.get("third class");
                        studentMarksList6.add(studentMarks10);

                    } else {
                        List<StudentMarks> studentMarksList5 = new ArrayList<>();
                        studentMarksList5.add(studentMarks10);
                        m1.put("third class", studentMarksList5);
                    }

                }



        }
        Set<String> s1=m1.keySet();
        for (String ra:s1){
            System.out.println("--------------------------------------------");
            List<StudentMarks> studentMarksList10=m1.get(ra);
            for (StudentMarks sm:studentMarksList10){
                System.out.println(sm.getId());
                System.out.println(sm.getName());
                System.out.println(sm.getPercentage());
                System.out.println(sm.getRank());
            }
        }
    }
}