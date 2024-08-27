package Emppack;

public class Mainemp {
    public static void main(String[]args){
        Employe em=new Employe();
        em.setEmpId(00256);
        em.setEmpName("Ravi Kumar");
        em.setDesignation("Developer");
        em.setSal(92000);
        EmpImjpl gt=new EmpImjpl();
        gt.CreatEmp(em);
        System.out.println("--------------------------------------------------------");
        Employe sf=new Employe();
        sf.setEmpName("udaykumjar");
        gt.CreatEmp(sf);
    }
}
