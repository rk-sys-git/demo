package Emppack;

public class EmpImjpl implements Regemp{
    @Override
    public void CreatEmp(Employe rp){
        System.out.println(rp.getEmpId());
        System.out.println(rp.getEmpName());
        System.out.println(rp.getDesignation());
        System.out.println(rp.getSal());
    }
}
