package Database;

import java.util.List;

public class MainEmp {
    public static void main(String[]args) throws Exception{
        Employe2 e1=new Employe2();
        e1.insertData(110,"hardik","pandya","mumbai",35);

        List<Emp> l2=e1.fetchdata();
        for (Emp e:l2){
            System.out.println("----------------------------------------------------------");
            System.out.println(e.getId());
            System.out.println(e.getFIRST_NAME());
            System.out.println(e.MIDDLE_NAME);
            System.out.println(e.getLAST_NAME());
            System.out.println(e.getAGE());
        }
    }
}
