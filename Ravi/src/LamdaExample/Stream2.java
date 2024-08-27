package LamdaExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Stream2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(
     list.stream()
                .filter(e -> e % 2 == 0)
                .mapToInt(e -> e * 2)
             .count());

        //.peek(e->System.out.println("-----------------------------------"))
              //.peek(e->System.out.println(e));

              /*.map(e->e*e)
              .peek(e->System.out.println("-----------------------------------"))
              .peek(e->System.out.println(e))

              //.forEach(e->System.out.println(e))
              .flatMap(e->List.of(e*2,e*3,e*4).stream())
              .peek(e->System.out.println(e))
              .reduce(0,(e,carry)->e+carry));
              //.forEach(e->System.out.println(e));

             //.reduce(0,(e,carry)->e+carry));*/




                //.reduce(0,(e,carry)->e+carry);

    }
}
