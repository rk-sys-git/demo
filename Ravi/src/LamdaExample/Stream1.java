package LamdaExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static oracle.net.aso.C09.e;

public class Stream1 {
    public static void main(String[]args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
numbers.stream()
        .map(e->{
    System.out.println("Squaring:"+e);
    return e*e;
        })
        .count();
    }
}
