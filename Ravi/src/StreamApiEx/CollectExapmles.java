package StreamApiEx;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

//import static java.util.stream.Nodes.collect;

public class CollectExapmles {
    public static void main(String[]args){
        /*List<Emplyoee> emplyoeeList =EmployeeData.get();
        String s=emplyoeeList.stream()
                .map(e->e.getFirstName())
                .collect(Collectors.joining(", "));
        System.out.println(s);
        System.out.println("------------------------------------------------------------");
        List<Emplyoee> emplyoeeList=EmployeeData.get();
       Map<Boolean, Long> emplyoeeList1=emplyoeeList.stream()
                .collect(Collectors.groupingBy(e->e.getSalary()>25000,Collectors.counting()));
       System.out.println(emplyoeeList1);*/
        List<Emplyoee> emplyoeeList=EmployeeData.get();
        Map<String, List<Emplyoee>> mmm= emplyoeeList.stream()
                .collect(Collectors.groupingBy(e -> e.getDepartment()));
        System.out.println(mmm);
    }

}
