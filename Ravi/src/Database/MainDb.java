package Database;

import PkSet.Student;

import java.util.List;

public class MainDb {
    public static void main(String[]args) throws Exception{
        Data d1=new Data();
        List<Student> studentList1 =d1.fetchData();
        for (Student sw:studentList1){
            System.out.println("------------------------------------");
            System.out.println(sw.getId());
            System.out.println(sw.getName());
            System.out.println(sw.getCity());
        }
    }
}
