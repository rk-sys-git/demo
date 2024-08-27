package PkSet;

import java.util.HashSet;
import java.util.Set;

public class MainStudent {
    public static void main(String[] args){
    ImplementStudent is=new ImplementStudent();
    Set<Student> lk=is.create();
    is.display(lk);
    }
}

