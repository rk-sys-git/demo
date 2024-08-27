package Database;

import PkSet.Student;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class Data {
    public List<Student> fetchData() throws Exception {

        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userName = "system";
        String password = "RAVIDBPASSWORD";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from student");

        List<Student> studentList=new ArrayList<>();

        while (rs.next()){
            int id=rs.getInt("id");
            String name=rs.getString("name");
           String city=rs.getString("city");
           Student s1=new Student();
           s1.setId(id);
           s1.setName(name);
           s1.setCity(city);
           studentList.add(s1);


            /*System.out.println("---------------------------------------------------");
            System.out.println(id);
            System.out.println(name);
            System.out.println(city);*/

        }
        return studentList;
    }
}

