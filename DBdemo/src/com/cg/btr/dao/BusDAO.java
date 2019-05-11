package com.cg.btr.dao;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Time;
import com.cg.btr.entity.Bus;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.util.*;
import com.cg.btr.entity.Routes;
public class BusDAO 
{
	
	public static Connection getConnection() throws Exception
	{
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		return DriverManager.getConnection(url,"nikitha","tiger");
	}
	public boolean storeBusDetails(Bus bus)
	{
		int count=0;
		try(Connection con=BusDAO.getConnection();
				PreparedStatement st=con.prepareStatement("insert into bus values(?,?,?,?,?,?)"))
		{
			st.setInt(1, bus.getId());
			st.setInt(2, bus.getRoute().getRouteid());
			st.setInt(3, bus.getSeats());
			st.setDouble(4,bus.getFare());
			st.setTime(5, bus.getArrtime());
			st.setTime(6, bus.getDeptime());
			count =st.executeUpdate();
			
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return count==1;
	}
 public List<Bus> searchBusBySourceDestination(String src,String dest)
 {
	 ArrayList<Bus> buses=new ArrayList<>();
	 Connection con=null;
	 PreparedStatement pst1=null;
	 PreparedStatement pst2=null;
	 ResultSet rs1=null;
	 ResultSet rs2=null;
	 ArrayList<String> list=null;
	 try
	 {
		 con=BusDAO.getConnection();
		 pst1= con.prepareStatement("select * from bus where routeid in(select routeid from routes where st1=? and st5=?)");
		 pst2=con.prepareStatement("select * from routes where routeid=?");
		 pst1.setString(1, src);
		 pst1.setString(2, dest);
		 rs1=pst1.executeQuery();
		 while(rs1.next())
		 {
			 pst2.setInt(1,rs1.getInt(2));
			 rs2=pst2.executeQuery();
			 Routes r=null;
			 
			 if(rs2.next())
			 {
				 r=new Routes();
				 r.setRouteid(rs2.getInt(1));
				 list=new ArrayList<>();
				 list.add(rs2.getString(2));
				 list.add(rs2.getString(3));
				 list.add(rs2.getString(4));
				 list.add(rs2.getString(5));
				 list.add(rs2.getString(6));
				 r.setRoutes(list);
			 }
			 buses.add(new Bus(rs1.getInt(1),r,rs1.getInt(3),rs1.getDouble(4),rs1.getTime(5),rs1.getTime(6)));
		 }
		 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return buses;
 }
 public List<Bus> getAllBusDetails()
 {
	 ArrayList<Bus> buses=new ArrayList<>();
	 Connection con=null;
	 PreparedStatement pst1=null;
	 PreparedStatement pst2=null;
	 ResultSet rs1=null;
	 ResultSet rs2=null;
	 ArrayList<String> list=null;
	 try
	 {
		 con=BusDAO.getConnection();
		 pst1=con.prepareStatement("select * from bus");
		 pst2= con.prepareStatement("select * from routes where route_id=?");
		 rs1=pst1.executeQuery();
		 while(rs1.next())
		 {
			 pst2.setInt(1,rs1.getInt(2));
			 rs2=pst2.executeQuery();
			 Routes r=null;
			 if(rs2.next())
			 {
				 r=new Routes();
				 r.setRouteid(rs2.getInt(1));
				 list=new ArrayList<>();
				 list.add(rs2.getString(2));
				 list.add(rs2.getString(3));
				 list.add(rs2.getString(4));
				 list.add(rs2.getString(5));
				 list.add(rs2.getString(6));
				 r.setRoutes(list);
			 }
			 buses.add(new Bus(rs1.getInt(1),r,rs1.getInt(3),rs1.getDouble(4),rs1.getTime(5),rs1.getTime(6)));
		 }
		 
	 }
	 catch(Exception e)
	 {
		 e.printStackTrace();
	 }
	 return buses;
 }
     public boolean deleteBusDetails(int id)
     {
    	 int count=0;
    	 try(Connection con=BusDAO.getConnection();
    			 PreparedStatement st=con.prepareStatement("delete from bus where id=?"))
    	 {
    		 st.setInt(1, id);
    		 count=st.executeUpdate();
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return count==1;
     }
     public boolean updateBusDetails(Bus bus)
     {
    	 int count=0;
    	 try(Connection con=BusDAO.getConnection();
    			 PreparedStatement st=con.prepareStatement("update bus set deptime=?,arrtime=? where id=?"))
    	 {
    		 st.setTime(1,bus.getArrtime());
    		 st.setTime(2,bus.getDeptime());
    		 st.setInt(3, bus.getId());
    		 count=st.executeUpdate();
    	 }
    	 catch(Exception e)
    	 {
    		 e.printStackTrace();
    	 }
    	 return count==1;
     }
}
