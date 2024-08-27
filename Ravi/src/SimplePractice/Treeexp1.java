package SimplePractice;

import java.util.Set;
import java.util.TreeSet;

public class Treeexp1 {
    public static void main(String[]args){
        Set nmae=new TreeSet();
        nmae.add("ravi");
        nmae.add("kumar");
        nmae.add("lasjhhhhhh");
        nmae.add("sdfg");
        nmae.add(123);
        for(Object nag:nmae){
            System.out.println(nag);
        }
    }
}
