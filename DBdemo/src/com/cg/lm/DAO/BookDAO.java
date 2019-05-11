package com.cg.lm.DAO;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Time;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.*;
import com.cg.lm.entity.*;
public class BookDAO 
{
	public static Connection getconnection() throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url,"nikitha","tiger");
		
		
	}
	public List<Book> searchBookByTitle(String title)
	{
		ArrayList<Book> book=new ArrayList<>();
		 ArrayList<String> list=null;
		 ResultSet rs=null;
		try(Connection con=BookDAO.getconnection();
				PreparedStatement pst1=con.prepareStatement("select  * from book where title=?"))
		{
		  pst1.setString(1,title);
		  rs=pst1.executeQuery();
		  if(rs.next())
			  book.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6)));
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return book;
	}
	public List<Book> searchBookByAuthor(String author)
	{
		ArrayList<Book> book=new ArrayList<>();
		 ArrayList<String> list=null;
		 ResultSet rs=null;
		try(Connection con=BookDAO.getconnection();
				PreparedStatement pst1=con.prepareStatement("select  * from book where author=?"))
		{
		  pst1.setString(1,author);
		  rs=pst1.executeQuery();
		  if(rs.next())
			  book.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6)));
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return book;
	}
	public List<Book> searchBookByPublisher(String publisher)
	{
		ArrayList<Book> book=new ArrayList<>();
		 ArrayList<String> list=null;
		 ResultSet rs=null;
		try(Connection con=BookDAO.getconnection();
				PreparedStatement pst1=con.prepareStatement("select  * from book where publisher=?"))
		{
		  pst1.setString(1,publisher);
		  rs=pst1.executeQuery();
		  if(rs.next())
			  book.add(new Book(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getDouble(5),rs.getInt(6)));
		 }
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return book;
	}

}
