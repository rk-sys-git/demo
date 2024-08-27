package StreamApiEx;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void main(String[]args) {
        List<Emplyoee> emplyoeeList = EmployeeData.get();
        /*emplyoeeList.stream().forEach(e->{
            System.out.println(e);

        });
        System.out.println("------------------------------------------");
        emplyoeeList.stream().filter(e->e.getLastName().startsWith("k"))
                .filter(e->e.getSalary()>50000)
                .forEach(e->System.out.println(e));

        System.out.println("---------------------------------------------------------------");
        emplyoeeList.stream()
                .sorted((e1,e2)->e1.getFirstName().compareTo(e2.getFirstName()))
                .forEach(e->System.out.println(e));
        System.out.println("-----------------------------------------------------------------");
        emplyoeeList.stream()
                .map(e->e.getFirstName())
                .distinct()
                .forEach(e->System.out.println(e));

        System.out.println("-----------------------------------------------------------------");
        System.out.println(emplyoeeList.stream()
                .filter(e->e.getDepartment().equals("sr"))
                .peek(e->System.out.println(e))
                .count());
        System.out.println("-----------------------------------------------------------------");*/
      /* emplyoeeList.stream()
               // .filter(e->e.getDepartment().equals("sr"))

                        //.peek(e->System.out.println(e))
                //.mapToDouble(e->e.getSalary())
                //.reduce(0,(e,carry)->e+carry));

               .distinct()
                        .forEach(e->System.out.println(e));*/
        List<String> list = emplyoeeList.stream()
                .map(e -> e.getFirstName())
                .distinct()
                .toList();
        System.out.println(list);
System.out.println("-------------------------------------------------------");
        List<String> collect = emplyoeeList.stream()
                .map(e -> e.getFirstName())
                .distinct()
                .collect(Collectors.toList());
        collect.add("chotu");
        System.out.println(collect);
        System.out.println("-------------------------------------------------------");
List<String> collect1 = emplyoeeList.stream()
                .map(e -> e.getFirstName())
                .distinct()
                .collect(Collectors.toUnmodifiableList());
      // collect1.add("kkkkkkkkkk");
        System.out.println(collect1.getClass());
            }



}
