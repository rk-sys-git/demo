package Database;

import java.sql.*;import java.util.ArrayList;
import java.util.List;


public class Employe {
    public List<Emp> fetchdata() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userName = "system";
        String password = "RAVIDBPASSWORD";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from emp");
        List<Emp> list = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("ID");

                String fname = rs.getString("FIRST_NAME");
                String mname = rs.getString("MIDDLE_NAME");
                String lname = rs.getString("LAST_NAME2");
                int age = rs.getInt("AGE");
                Emp er = new Emp();
                er.setId(id);
                er.setFIRST_NAME(fname);
                er.setLAST_NAME(lname);
                er.setMIDDLE_NAME(mname);
                er.setAGE(age);
                list.add(er);


            }


        s.close();
        con.close();
        rs.close();
return list;

    }

    public int insertData(int id,String fName,String mName,String lName,int age)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String userName="system";
        String password="RAVIDBPASSWORD";
        Connection con=DriverManager.getConnection(url,userName,password);
       Statement s=con.createStatement();
        int result=s.executeUpdate("insert into emp(ID,FIRST_NAME,MIDDLE_NAME,LAST_NAME2,AGE)values('11','anand','kumar','akella','30')");
        PreparedStatement ps = con.prepareStatement("insert into emp(ID,FIRST_NAME,MIDDLE_NAME,LAST_NAME2,AGE)values(?,?,?,?,?)");
        ps.setInt(1,id);
        ps.setString(2,fName);
        ps.setString(3,mName);
        ps.setString(4,lName);
        ps.setInt(5,age);
        int result1 = ps.executeUpdate();
        if (result>0) {
            System.out.println("updated");
        }
            else{
                System.out.println("notupdated");

ps.close();
con.close();
        }
      return result;

    }

}