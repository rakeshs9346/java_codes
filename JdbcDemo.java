
import java.sql.*;
 public class JdbcDemo {
   public static void main(String[] args){
      
      
      String url="jdbc:mysql://localhost:3306/rakesh";
      String username="root";
      String password="rakesh$123";
      String query="select * from Student";
     try { 
      Connection con=DriverManager.getConnection(url, username, password);
      Statement st=con.createStatement();
      ResultSet rs=st.executeQuery(query);
      
      while(rs.next()) {
         System.out.println(rs.getInt(1)+":"+rs.getString(2)+":"+rs.getInt(3)+":"+rs.getInt(4));
         
      }
      
      st.close();
      con.close();
     }catch(SQLException e) {
        e.printStackTrace();
     }
   }
}
   