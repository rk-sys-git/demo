package StreamApiEx;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeData {
    public static ArrayList<Emplyoee> get(){
        return new ArrayList<Emplyoee>(Arrays.asList(
                new Emplyoee(1,"ravi","kumar","dev","se",50000,27),
                new Emplyoee(2,"uday","kumar","dba","jr",10000,29),
                new Emplyoee(3,"vijaya","kumar","hr","sr",80000,32),
                new Emplyoee(4,"chandra","rao","gland","sr",90000,34),
                new Emplyoee(5,"kalyan","pawan","movie","sr",19000,40),
                new Emplyoee(6,"nani","rao","movie","dev",9000,40)
                ));
    }
}
