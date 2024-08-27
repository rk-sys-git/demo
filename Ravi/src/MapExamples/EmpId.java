package MapExamples;
import jdbcMap.Emp;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpId {
    public void fecthData()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String userName="system";
        String password="RAVIDBPASSWORD";
        Connection con=DriverManager.getConnection(url,userName,password);
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from emp");
        List<Emp> empList=new ArrayList<>();
        while (rs.next()){
            int id=rs.getInt("ID");
            String fname=rs.getString("FIRST_NAME");
            String mname=rs.getString("MIDDLE-NAME2");
            String lname=rs.getString("LAST_NAME");
            int age=rs.getInt("AGE");
            String dname=rs.getString("DEPARTMENTNAME");
        }

    }
}
