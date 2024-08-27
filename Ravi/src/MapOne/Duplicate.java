package MapOne;

import java.util.*;

public class Duplicate {
    public static void main(String[] args) {
        List a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(2);
        a.add(1);
        a.add(1);
        a.add("ravi");
        a.add("ravi");
        a.add("uday");
        a.add(5);
        a.add(3);
        Map m = new HashMap<>();
        for (Object obj : a) {
            if (m.containsKey(obj)) {
                Object out = m.get(obj);
                int u = (int) out;
                u = u + 1;
                m.put(obj, u);

            } else {
                m.put(obj, 1);
            }
        }
        Set s = m.keySet();
        for (Object object : s) {
            Object output = m.get(object);
            
            int l = (int) output;

            if (l > 1) {

                //System.out.println(object + "---------" + gh);
            }


        }
    }
}