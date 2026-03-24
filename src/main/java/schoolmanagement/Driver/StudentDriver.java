package schoolmanagement.Driver;
import java.sql.SQLException;

import java.util.List;
import java.util.Scanner;
import schoolmanagement.Entity.Student;
import schoolmanagement.Service.StudentService;
public class StudentDriver {
	public static void main(String[] args) {
		StudentService service=new StudentService();
		
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
		System.out.println("Enter ur choice");
		System.out.println("Enter 1 to Register");
		System.out.println("Enter 2 to Update");
		
		System.out.println("Enter 3 to Fetch");
		System.out.println("Enter 4 to Delete");
		System.out.println("Enter 5 to close");
		System.out.println("Enter 6 to update all");
		System.out.println("Enter 7 to fetchage");
		System.out.println("Enter 8 to fetchagegreater");
		System.out.println("Enter 9 to fetchagegreater");
		System.out.println("Enter 10 to fetchagegreater");
		System.out.println("Enter 11 to fetchname");
		System.out.println("Enter 12 to fetchemail");
		System.out.println("Enter 13 to fetchblood_group");
		System.out.println("Enter 14 to fetchnamestart");
		System.out.println("Enter 15 to fetchnameend");
		int choice=sc.nextInt();
		Student st=new Student();
		switch(choice) {
		
		case 1: {
			System.out.println("id");
			int sid = sc.nextInt();
			System.out.println("name");
			String sname = sc.next();
			System.out.println("age");
			int age = sc.nextInt();
			System.err.println("email");
			String email = sc.next();
			System.out.println("bg");
			String blood_group = sc.next();
			
			st.setid(sid);
			st.setname(sname);
			st.setage(age);
			st.setemail(email);
			st.setblood_group(blood_group);
			
			int save=service.save(st);
			if(save!=0) {
				System.out.println("Data saved");
			} else {
				System.out.println("Data is not saved");
			}
			break;
		}
		case 2: {
			System.out.println("Enter the id");
			int id=sc.nextInt();
			System.out.println("Enter the age");
			int age=sc.nextInt();
			
			st.setage(age);
			st.setid(id);
			
			int res=service.update(id,age);
			if(res!=0)
				System.out.println("Data updated");
			else
				System.out.println("Data is not updated");
			break;
		}
		case 3: {
			 List<Student> list = service.fetch_all();
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		}
		case 4: {
			System.out.println("Enter id to delete");
			int id=sc.nextInt();
			
			st.setid(id);
			
			int res=service.delete(id);
			if(res!=0) {
				System.out.println("Deleted successfully");
			}else {
				System.out.println("Deletion unsuccessfull");
			}
			break;
		}
		case 5: {
			if(service.exit()) {
				System.out.println("connection closed");
				flag=false;
			}
			else {
				System.out.println("Failed to close the connection.");
			}
			break;
		}
		case 6: {
			System.out.println("id");
			int sid = sc.nextInt();
			System.out.println("name");
			String sname = sc.next();
			System.out.println("age");
			int age = sc.nextInt();
			System.err.println("email");
			String email = sc.next();
			System.out.println("bg");
			String blood_group = sc.next();
			st.setid(sid);
			st.setname(sname);
			st.setage(age);
			st.setemail(email);
			st.setblood_group(blood_group);
			int res=service.updateall(age, sid, sname, email, blood_group);
			if(res!=0)
				System.out.println("Data updated");
			else
				System.out.println("Data is not updated");
			break;
			
			
		}
		case 7: {
			System.out.println("age");
			int age=sc.nextInt();
			
			st.setage(age);
			List<Student> list = service.fetchage(age);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		
		}
		case 8: {
			System.out.println("age");
			int age=sc.nextInt();
			
			st.setage(age);
			List<Student> list = service.fetchagegreater(age);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		
		}
		case 9: {
			System.out.println("age");
			int age=sc.nextInt();
			
			st.setage(age);
			List<Student> list = service.fetchagelesser(age);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		
		}
		case 10: {
			System.out.println("age");
			int min=sc.nextInt();
			System.out.println("age");
			int max=sc.nextInt();
			
			
			List<Student> list = service.fetchageinbetween(min,max);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		
		}
		case 11: {
			System.out.println("name");
			String name=sc.next();
			
			st.setname(name);
			List<Student> list = service.fetchname(name);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		}
		case 12: {
			System.out.println("email");
			String email=sc.next();
			
			st.setemail(email);
			List<Student> list = service.fetchemail(email);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		}
		case 13: {
			System.out.println("blood_group");
			String bg=sc.next();
			
			st.setblood_group(bg);
			List<Student> list = service.fetchblood_group(bg);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			break;
		}
		case 14: {
			System.out.println("enter starting letter");
			String start=sc.next();
			List<Student> list = service.fetchnamestart(start);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			
			break;
		}
		case 15: {
			System.out.println("enter ending letter");
			String end=sc.next();
			List<Student> list = service.fetchnameend(end);
			if(list != null) {
				for(Student stu:list) {
					System.out.println(stu);
				}
			}
			else {
				System.out.println("No student records found");
			}
			
			break;
		}
		default:
			System.out.println("invalid data");
			break;
			
			
		}
		
		}
	}
}
