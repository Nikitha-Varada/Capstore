package com.cg.lm.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.*;
import com.cg.lm.entity.*;
import com.cg.lm.entity.Book;
public class StudentDAO
{
	public static Connection getconnection() throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url,"nikitha","tiger");
		
		
	}
	public List<Student> searchStudentById(int student_id)
	{
		ArrayList<Student> student=new ArrayList<>();
		 ArrayList<String> list=null;
		 ResultSet rs=null;
		try(Connection con=StudentDAO.getconnection();
				PreparedStatement pst1=con.prepareStatement("select  * from student where user_id=?"))
		{
		  pst1.setInt(1,student_id);
		  rs=pst1.executeQuery();
		  if(rs.next())
			 student.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4)));
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return student;
	}
	public List<Student> searchStudentByMobile(long mobile)
	{
		ArrayList<Student> student=new ArrayList<>();
		 ArrayList<String> list=null;
		 ResultSet rs=null;
		try(Connection con=StudentDAO.getconnection();
				PreparedStatement pst1=con.prepareStatement("select  * from student where mobile=?"))
		{
		  pst1.setLong(1,mobile);
		  rs=pst1.executeQuery();
		  if(rs.next())
			 student.add(new Student(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getLong(4)));
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return student;
	}

}
