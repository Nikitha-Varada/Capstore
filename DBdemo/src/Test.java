import com.cg.btr.dao.*;
import com.cg.btr.entity.*;
import java.sql.Time;
import java.util.*;
public class Test 
{
  public static void main(String[] args) 
  {
	ArrayList<Bus> list=null;
	list=(ArrayList<Bus>)new BusDAO().searchBusBySourceDestination("Banglore","srilanka");
	for(Bus b: list)
	{
		System.out.println(b.getId()+" "+b.getArrtime()+" "+b.getDeptime());
		for(String s: b.getRoute().getRoutes())
			System.out.print(s+" ");
		System.out.println();
	}
	  
  }

}
//getAllBusDetails();