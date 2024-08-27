package Database;
import java.sql.*;

public class Practice {
    public void fetchdata() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userName = "system";
        String password = "RAVIDBPASSWORD";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("select * from emp");
        //PreparedStatement PS = con.prepareStatement("select * from emp where ID=?");
       // PS.setInt(1, id);
        //ResultSet rs = PS.executeQuery();
        while (rs.next()) {
            int dd = rs.getInt("ID");
            String fname = rs.getString("FIRST_NAME");
            String mname = rs.getString("MIDDLE_NAME");
            String lname = rs.getString("LAST_NAME2");
            System.out.println(dd);
            System.out.println(fname);
            System.out.println(mname);
            System.out.println(lname);
        }


    }
}
