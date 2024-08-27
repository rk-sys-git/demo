package StudentList;

import java.util.List;

public class MainStudent {
    public static void main(String[]args){
        StudImjpl w=new StudImjpl();
        List al=w.StudentDetails();
        w.display(al);

    }
}
