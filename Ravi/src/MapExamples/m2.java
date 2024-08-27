package MapExamples;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class m2 {
    public static void main(String[]args){
    Map m=new HashMap<>();
        m.put(1,"uday");
        m.put(2,"kumar");
        m.put("test","kiran");
        m.put(2,"kalyan");
        m.put(null,"love");
        m.put(null,"chandu");
        Set s=m.keySet();
        for (Object obj:s){
            Object output=m.get(obj);
            System.out.println(output);
        }
}
}