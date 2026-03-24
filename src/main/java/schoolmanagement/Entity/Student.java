package schoolmanagement.Entity;

public class Student {
	private int sid;
	private String sname;
	private int age;
	private String email;
	private String blood_group;
	public Student(int sid,String sname,int age,String email,String blood_group) {
		this.sid=sid;
		this.sname=sname;
		this.age=age;
		this.email=email;
		this.blood_group=blood_group;
	}
	@Override
	public String toString() {
		return "Student [sid="+sid+",sname="+sname+",age="+age+",email="+email+",blood_group="+blood_group+"]";
	}
	public Student() {
		
	}
	
	public int getid() {
		return sid;
	}
	public void setid(int sid) {
		this.sid=sid;
	}
	
	public String getname() {
		return sname;
	}
		
	public void setname(String sname) {
		this.sname=sname;
	}
	public int getage() {
		return age;
	}
	public void setage(int age) {
		this.age=age;
	}
	public String getemail() {
		return email;
	}
	public void setemail(String email) {
		this.email=email;
	}
	public String getblood_group() {
		return blood_group;
	}
	public void setblood_group(String blood_group) {
		this.blood_group=blood_group;
	}
		
}
	