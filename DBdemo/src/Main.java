
import com.cg.lm.DAO.*;
import com.cg.lm.entity.*;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;                                            
import java.util.ArrayList;
public class Main {

	public static void main(String[] args) 
	{

		ArrayList<Book> list=null;
		list=(ArrayList<Book>)new BookDAO().searchBookByAuthor("mc grill");
		for(Book b: list)
		{
			System.out.println("search by author:"+b.getBook_id()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getPages()+" "+b.getPrice());
			System.out.println();
		}
		list=(ArrayList<Book>)new BookDAO().searchBookByTitle("SPM");
		for(Book b: list)
		{
			System.out.println("search by title:"  +b.getBook_id()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getPages()+" "+b.getPrice());
			System.out.println();
		}
		
		list=(ArrayList<Book>)new BookDAO().searchBookByPublisher("sanfoundry");
		for(Book b: list)
		{
			System.out.println("search by publisher:"  +b.getBook_id()+" "+b.getTitle()+" "+b.getAuthor()+" "+b.getPublisher()+" "+b.getPages()+" "+b.getPrice());
			System.out.println();
		}

		ArrayList<Student> list1=null;
		list1=(ArrayList<Student>)new StudentDAO().searchStudentById(502);
		for(Student s: list1)
		{
			System.out.println("search by id:"  +s.getStudent_id()+" "+s.getName()+" "+s.getAddress()+" "+s.getMobile());
			System.out.println();
		}
		list1=(ArrayList<Student>)new StudentDAO().searchStudentByMobile(1234567);
		for(Student s: list1)
		{
			System.out.println("search by mobile:"  +s.getStudent_id()+" "+s.getName()+" "+s.getAddress()+" "+s.getMobile());
			System.out.println();
		} 
		
		Book b=new Book(101,"oops","mc grill","india",450,900);
		Student s=new Student(503,"sanju","dsnr",1234567);
		Transaction t1=new Transaction(2,b,s,Date.valueOf(LocalDate.of(2019, 02, 23)),Date.valueOf(LocalDate.of(2019, 02, 23)),Date.valueOf(LocalDate.of(2019, 03, 23)));
		boolean f= new TransactionDAO().issuebook(t1);
		 if(f)
			 System.out.println("issued");
		 else
			 System.out.println("not issued");
		 
	}
}


