package com.cg.lm.DAO;
import java.time.LocalDate;
import java.sql.Connection;
import java.sql.DriverManager;
import com.cg.lm.entity.*;
import java.sql.PreparedStatement;
import java.sql.*;

public class TransactionDAO 
{
	public static Connection getconnection() throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url,"nikitha","tiger");
			
	}
	public boolean issuebook(Transaction t)
	{
		int count=0;
		try(Connection con=TransactionDAO.getconnection();
				PreparedStatement pst1=con.prepareStatement("insert into transaction values(?,?,?,?,?,?)"))
		{
	      LocalDate d = LocalDate.now();
		  pst1.setInt(1,t.getTid());
		  pst1.setDate(2, Date.valueOf(LocalDate.now()) );
		  pst1.setDate(3, Date.valueOf(d.plusDays(15)));
		  pst1.setDate(4, t.getReturndate());
		  pst1.setInt(5, t.getBook().getBook_id());
		  pst1.setInt(6, t.getStudent().getStudent_id());
		  count=pst1.executeUpdate();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		return count==1;
	}
	

}
