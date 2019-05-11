package com.cg.btr.dao;
import java.sql.*;
import java.util.*;
import com.cg.btr.entity.Passenger;

public class PassengerDAO 
{
	public static Connection getconnection() throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url,"nikitha","tiger");
		
	}
	public boolean storePassengerDetails(Passenger p)
	{
		int count=0;
		try(Connection con=PassengerDAO.getconnection();
				PreparedStatement pst=con.prepareStatement("insert into passenger values(?,?,?,?,?)"))
						{
					         pst.setInt(1, p.getPassengerid());
					         pst.setString(2, p.getName());
					         pst.setInt(3, p.getAge());
					         pst.setString(4,String.valueOf(p.getGender()));
					         pst.setLong(5, p.getMobile());
					         count=pst.executeUpdate();
						}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return count==1;
	}

}
