package StreamApiEx;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class MapGet {
    public static  void main(String[]args){
        List<Emplyoee> emplyoeeList=EmployeeData.get();

      Map<String, Integer> stringMap =emplyoeeList.stream()
              .collect(Collectors.toMap(
                      e->e.getFirstName(),
                      e->e.getSalary(),

                      (a,b)->b

              ));
      System.out.println(stringMap);
      System.out.println("-------------------------------------------------------------------");

        Map<String, String> stringMap1 =emplyoeeList.stream()
                .collect(Collectors.toMap(
                        e->e.getFirstName(),
                        e->e.getDepartment(),




                        (a,b)->a+"-"+b
                ));
        System.out.println(stringMap1);


    }
}
