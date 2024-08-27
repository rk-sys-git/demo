package MapExamples;

import java.util.HashMap;
import java.util.Map;

public class M1
    {
    public static void main(String[]args){
        Map m=new HashMap<>();
        m.put(1,"uday");
        m.put(2,"kumar");
        m.put("test","kiran");
        m.put(2,"kalyan");
        m.put(null,"love");
        m.put(null,"chandu");
        System.out.println(m.get(2));
        System.out.println(m.get("test"));
        System.out.println(m.get(null));
        System.out.println(m.containsKey(2));
    }
}
