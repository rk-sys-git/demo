package Jdbc;
import java.sql.*;
public class Data {
    public void fetchData()throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String userName="system";
        String password="RAVIDBPASSWORD";
        Connection con=DriverManager.getConnection(url,userName,password);
        Statement s=con.createStatement();
        ResultSet rs=s.executeQuery("Select * from student");
        while (rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
            String city=rs.getString("city");
            System.out.println("--------------------");
            System.out.println(id);
            System.out.println(name);
            System.out.println(city);
        }
    }

    public int insertData(int id,String name,String city)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String userName="system";
        String passWord="RAVIDBPASSWORD";
        Connection con=DriverManager.getConnection(url,userName,passWord);
        PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?)");
        ps.setInt(1,id);
        ps.setString(2,name);
        ps.setString(3,city);

        int result=ps.executeUpdate();
        if (result>0){
            System.out.println("updated");
        }else {
            System.out.println("notUpdated");
        }
        return result;
    }

    public int upadteData(int id)throws Exception{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url="jdbc:oracle:thin:@localhost:1521:orcl";
        String userName="system";
        String passWord="RAVIDBPASSWORD";
        Connection con=DriverManager.getConnection(url,userName,passWord);
        PreparedStatement ps=con.prepareStatement("upadte student SET ");
        ps.setInt(1,id);

        int result=ps.executeUpdate();
        if (result>0){
            System.out.println("updated");
        }else {
            System.out.println("notUpdated");
        }
        return result;
    }

}
