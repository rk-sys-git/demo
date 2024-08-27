package MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Contain {
    public static void main(String[]args){
        String s="!abcdabbch"; //['a','b','c','d','a']
        char[] chars=s.toCharArray();
        Map m=new HashMap<>();
        for (int i=0;i<chars.length;i++) {
            char c = chars[i];
            if (m.containsKey(c)) {
                Object count = m.get(c);
                int mul = (int) count;
                mul = mul + 1;
                m.put(c, mul);
            } else {
                m.put(c, 1);
            }
        }
            Set sr=m.keySet();
            for (Object obj:sr){
                Object output=m.get(obj);
                System.out.println(obj+"--"+output);
            }
        }
    }

