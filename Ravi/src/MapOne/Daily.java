package MapOne;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Daily {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put(1, "ravi");
        map.put(2, "uday");
        map.put(3, "kumar");

        Set s = map.keySet();
        for (Object o : s) {
            Object ouput = map.get(o);
            System.out.println(ouput);

        }
    }
}