package MapExamples;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        l1.add(100);
        l1.add(200);
        l1.add(300);

        String finalnumber = null;
        for (Integer i : l1) {
            String num = i.toString();
            if (finalnumber == null) {
                finalnumber = num;
            } else {
                finalnumber = finalnumber + "," + num;
            }

        }
        System.out.println(finalnumber);


    }
}
