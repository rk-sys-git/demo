package Database;
import java.sql.*;
public class Hope {
    public void fetchData()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String userName="system";
        String password="RAVIDBPASSWORD";
        Connection con=DriverManager.getConnection(url,userName,password);
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from emp");
        while (rs.next()){
            int id=rs.getInt("id");
            String fname=rs.getString("FIRST_NAME");
            String mname=rs.getString("MIDDLE_NAME");
            String lname=rs.getString("LAST_NAME2");
            System.out.println("-----------------------------------");
            System.out.println(id);
            System.out.println(fname);
            System.out.println(mname);
            System.out.println(lname);
        }
    }
}
