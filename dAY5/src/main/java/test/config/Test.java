package test.config;


import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static List resultList;

    public static List showData(DataSource dataSource, String name){
       resultList=new ArrayList();
        //PreparedStatement stmt = null;
        try {
         PreparedStatement stmt = dataSource.getConnection().prepareStatement("select * from user where firstName like ? Or lastName like ? ;");
            stmt.setString(1, "%" + name + "%");
            stmt.setString(2, "%" + name + "%");

            ResultSet rs = stmt.executeQuery();
            System.err.println(rs);
            while(rs.next()){
                String fname = rs.getString("firstName");
                String lname = rs.getString("lastName");
                String username = rs.getString("name");
                String pass = rs.getString("pass");

                resultList.add(fname);
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return resultList;


}
}
