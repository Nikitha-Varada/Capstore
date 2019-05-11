import java.sql.*;
public class DBTest 
{
	public static void main(String[] args) throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Connection con=DriverManager.getConnection(url,"nikitha","tiger");
		con.setAutoCommit(false);
		PreparedStatement st=con.prepareStatement("insert into employee values(?,?,?)");
		st.setInt(1, 105);
		st.setString(2, "sanju");
		st.setDouble(3, 8000);
		st.executeUpdate();
		con.commit();
		PreparedStatement st1=con.prepareStatement("delete from employee where empid=?");
		st1.setInt(1, 101);
		st1.executeUpdate();
		con.rollback();
			
		}
		
		
}


