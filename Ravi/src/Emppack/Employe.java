package Emppack;

public class Employe {
    private int empId;
    private String empName;
    private String designation;
    private int sal;

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public void setEmpName(String empName){
        this.empName=empName;
    }
    public void setDesignation(String designation){
        this.designation=designation;
    }
    public void setSal(int sal){
        this.sal=sal;
    }

    public int getEmpId(){
        return this.empId;
    }
    public String getEmpName(){
        return this.empName;
    }
    public String getDesignation(){
        return this.designation;
    }
    public int getSal(){
        return this.sal;
    }
}
