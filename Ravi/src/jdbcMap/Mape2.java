package jdbcMap;
import java.sql.*;
import java.util.*;

public class Mape2 {
    public List<Emp> fetchdata() throws Exception {
        Class.forName("oracle.jdbc.driver.OracleDriver");
        String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        String userName = "system";
        String password = "RAVIDBPASSWORD";
        Connection con = DriverManager.getConnection(url, userName, password);
        Statement s = con.createStatement();
        ResultSet rs = s.executeQuery("select * from emp");
        List<Emp> empList = new ArrayList<>();
        while (rs.next()) {
            int id = rs.getInt("ID");
            String fname = rs.getString("FIRST_NAME");
            String mname = rs.getString("MIDDLE_NAME");
            String lname = rs.getString("LAST_NAME2");
            int age = rs.getInt("AGE");
            String dname = rs.getString("DEPTNAME");

            Emp e1 = new Emp();
            e1.setId(id);
            e1.setFIRST_NAME(fname);
            e1.setMIDDLE_NAME(mname);
            e1.setLAST_NAME(lname);
            e1.setAGE(age);
            e1.setDEPTNAME(dname);
            empList.add(e1);
        }

        Map<String, List<Emp>> employemap = new HashMap<>();



        for (Emp employe : empList) {
            if (employe.getDEPTNAME() != null) {
                if (employemap.containsKey(employe.getDEPTNAME())) {
                    List<Emp> empList2=employemap.get(employe.getDEPTNAME());
                    empList2.add(employe);

                }else {
                    List<Emp> empList1=new ArrayList<>();
                    empList1.add(employe);
                    employemap.put(employe.getDEPTNAME(), empList1);
                }

            }
        }
        Set<String> dnameSet = employemap.keySet();
        for (String se : dnameSet) {
            List<Emp> emps = employemap.get(se);


            for (Emp esd : emps) {
                //Emp esd=employemap.get(e);

                //String rt = esd.getDEPTNAME();


                    System.out.println(esd.getDEPTNAME());

                    System.out.println(esd.getId());
                    System.out.println(esd.getFIRST_NAME());
                    System.out.println(esd.getMIDDLE_NAME());
                    System.out.println(esd.getLAST_NAME());
                    System.out.println(esd.getAGE());


            }

        }
        return empList;
    }
}
