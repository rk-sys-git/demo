package Database;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Employe1 {
    public List<Emp> fetchdata() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userName = "system";
        String password = "RAVIDBPASSWORD";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from emp ");
        List<Emp> list = new ArrayList<>();
        while (rs.next()) {
            int age = rs.getInt("AGE");
            if (age < 25) {
                int id = rs.getInt("ID");
                String fname = rs.getString("FIRST_NAME");
                String mname = rs.getString("MIDDLE_NAME");
                String lname = rs.getString("LAST_NAME2");

                Emp er = new Emp();
                er.setId(id);
                er.setFIRST_NAME(fname);
                er.setLAST_NAME(lname);
                er.setMIDDLE_NAME(mname);
                er.setAGE(age);
                list.add(er);

            }




        }
        return list;
    }

}