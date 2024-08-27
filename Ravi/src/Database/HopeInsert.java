package Database;

import oracle.jdbc.driver.OracleDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class HopeInsert {
    public int insertdata(int id,String fname)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String userName="system";
        String password="RAVIDBPASSWORD";
        Connection con= DriverManager.getConnection(url,userName,password);
        PreparedStatement ps=con.prepareStatement("UPDATE emp SET FIRST_NAME =? WHERE ID=?");
        ps.setString(1,fname);
        ps.setInt(2,id);

        int result=0;
        ps.executeQuery();
        if (result>0){
            System.out.println("updated");
        }else {
            System.out.println("notupdated");
        }
        ps.close();
        con.close();
        return result;
    }
}
