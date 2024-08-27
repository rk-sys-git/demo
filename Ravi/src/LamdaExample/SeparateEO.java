package LamdaExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SeparateEO {
    public static void main(String[]args){
        List<Integer> integerList=new ArrayList<>(Arrays.asList(1,2,4,7,13,16,19,21,24,28));
        Map<Boolean,List<Integer>> oddEvenNumbersMap=
                integerList.stream().collect(Collectors.partitioningBy(i->i%2==0));
    }
}
