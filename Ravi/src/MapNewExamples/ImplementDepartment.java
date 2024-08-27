package MapNewExamples;

import java.util.*;

public class ImplementDepartment {
    public static void main(String[] args) {
        Department department = new Department();
        department.setEmployeid(111);
        department.setDepartmentName("maths");
        department.setEmployeName("ravikumar");

        Department department1 = new Department();
        department1.setEmployeid(122);
        department1.setDepartmentName("physics");
        department1.setEmployeName("chandu");

        Department department2 = new Department();
        department2.setEmployeid(221);
        department2.setDepartmentName("maths");
        department2.setEmployeName("kumar");

        Department department3 = new Department();
        department3.setEmployeid(101);
        department3.setDepartmentName("maths");
        department3.setEmployeName("ravikumar");

        Department department4 = new Department();
        department4.setEmployeid(331);
        department4.setDepartmentName("maths");
        department4.setEmployeName("sailaja");

        Department department5 = new Department();
        department5.setEmployeid(999);
        department5.setDepartmentName("chemistry");
        department5.setEmployeName("rangha");

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(department);
        departmentList.add(department1);
        departmentList.add(department2);
        departmentList.add(department3);
        departmentList.add(department4);
        departmentList.add(department5);

        Map<String, List<Department>> m1 = new HashMap<>();
        for (Department department6 : departmentList) {
            if (m1.containsKey(department6.getDepartmentName())) {
                List<Department> departmentList2=m1.get(department6.getDepartmentName());
                departmentList2.add(department6);

            } else {


                List<Department> departmentList1 = new ArrayList<>();
                departmentList1.add(department6);
                m1.put(department6.getDepartmentName(), departmentList1);
            }
        }
        Set<String> s1=m1.keySet();
        System.out.println("--------------------------------------------");
        for (String dept:s1){
            List<Department> departmentList3=m1.get(dept);
            System.out.println("--------------------------------------------");
            for (Department dept1:departmentList3){
                System.out.println(dept1.getDepartmentName());
                System.out.println(dept1.getEmployeid());
                System.out.println(dept1.getEmployeName());

            }

        }
    }
}