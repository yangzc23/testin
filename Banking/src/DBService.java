import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBService
{
  String driver = "org.apache.derby.jdbc.EmbeddedDriver";
  Connection conn = null;
  
  public DBService()
  {
    String sql = "select * from users";
    Statement stat = null;
    try
    {
      Class.forName(this.driver).newInstance();
      this.conn = DriverManager.getConnection("jdbc:derby:dbservice;create=true");
      stat = this.conn.createStatement();
      ResultSet rs;
      return;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    finally
    {
      stat = null;
    }
  }
  
  public boolean check(String name, String password)
  {
    try
    {
      Statement stat = this.conn.createStatement();
      String sql = "select password from users where name='" + name + "'";
      ResultSet rs = stat.executeQuery(sql);
      if ((rs.next()) && 
        (password.equals(rs.getString("password")))) {
        return true;
      }
      return false;
    }
    catch (SQLException e) {}
    return false;
  }
  
  public boolean addUser(String name, String password)
  {
    try
    {
      Statement stat = this.conn.createStatement();
      String sql = "delete from users where name='" + name + "'";
      stat.execute(sql);
      sql = "insert into users values ('" + name + "', '" + password + "')";
      stat.execute(sql);
      return true;
    }
    catch (SQLException e)
    {
      e.printStackTrace();
    }
    return false;
  }
}
