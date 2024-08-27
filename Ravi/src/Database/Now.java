package Database;
import java.sql.*;

public class Now {
    public int insertdata() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userName = "system";
        String password = "RAVIDBPASSWORD";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement s = con.createStatement();
        int result1 = s.executeUpdate("insert into emp(ID,FIRST_NAME,MIDDLE_NAME,LAST_NAME2,AGE)values('14','kum','srt','wer','32')");
        if (result1 > 0) {
            System.out.println("inserted");
        } else {
            System.out.println("not updated");
        }
        return result1;
    }
}

       /* ResultSet rs=S.executeQuery();
        List<Emp> empList=new ArrayList<>();
        while (rs.next()){
            int dd= rs.getInt("ID");
            String fname=rs.getString("FIRST_NAME");
            String mname=rs.getString("MIDDLE_NAME");
            String lname=rs.getString("LAST_NAME2");
            int age=rs.getInt("AGE");
            Emp e=new Emp();
            e.setId(dd);
            e.setFIRST_NAME(fname);
            e.setMIDDLE_NAME(mname);
            e.setLAST_NAME(lname);
            e.setAGE(age);
            empList.add(e);
        }
        return empList;

    }
}*/
