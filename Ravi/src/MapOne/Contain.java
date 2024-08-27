package MapOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contain {
    public static void main(String[] args) {
        String s = "abcsddabbcdfab";
        char[] c = s.toCharArray();
        Map m = new HashMap<>();
        for (int i = 0; i < c.length - 1; i++) {
            char p = c[i];
            if (m.containsKey(p)) {
                Object obj = m.get(p);
                int mul = (int) obj;
                mul = mul + 1;
                m.put(p, mul);

            } else {
                m.put(p, 1);
            }
        }
        Set kl = m.keySet();
        for (Object out : kl) {
            Object output = m.get(out);
            int d = (int) output;
            if (d == 1) {
                System.out.println(out + "-----------" + output);
            }

        }
    }
}