package schoolmanagement.Service;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

import schoolmanagement.Entity.Student;
import java.util.ArrayList;
public class StudentService {
	private static Connection con;
	private static String url="jdbc:postgresql://localhost:5432/student";
	private static String user="postgres";
	private static String pswd="123";
	static {
		try {
			Class.forName("org.postgresql.Driver");
			con=DriverManager.getConnection(url, user, pswd);
				
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public int save(Student st) {
		String sql="INSERT into student values(?,?,?,?,?)";
		int res=0;
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			
			pstm.setInt(1, st.getid());
			pstm.setString(2, st.getname());
			pstm.setInt(3, st.getage());
			pstm.setString(4, st.getemail());
			pstm.setString(5, st.getblood_group());
			res=pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	public int update(int id,int age) {
		String sql="UPDATE student set age=? where sid=?";
		int res=0;
		try {
			
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, age);
			pstm.setInt(2, id);
			res=pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	public int updateall(int age,int id,String name,String email,String blood_group) {
		String sql="UPDATE student set age=?,sname=?,blood_group=?,email=? where sid=?";
		int res=0;
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, age);
			pstm.setString(2, name);
			pstm.setString(3, blood_group);
			pstm.setString(4, email);
			pstm.setInt(5, id);
			res=pstm.executeUpdate();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	
	public int delete(int id) {
		String sql="DELETE from student where sid=?";
		int res=0;
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1, id);
			res=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return res;
	}
	public List<Student> fetch_all() {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			ResultSet rs=pstm.executeQuery();
			
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchage(int age) {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student where age=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1,age);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchagegreater(int age) {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student where age>=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1,age);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchagelesser(int age) {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student where age>=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1,age);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchageinbetween(int min,int max) {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student where age between ? and ?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setInt(1,min);
			pstm.setInt(2, max);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchblood_group(String blood_group) {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student where blood_group=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1,blood_group);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchname(String name) {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student where sname=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1,name);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchemail(String email) {
		List<Student> list=new ArrayList<Student>();
		String sql="Select * from student where email=?";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1,email);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchnamestart(String start) {
		List<Student> list=new ArrayList<>();
		String sql="SELECT * from student where sname like ?;";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1, start+"%");
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public List<Student> fetchnameend(String end) {
		List<Student> list=new ArrayList<>();
		String sql="SELECT * from student where sname like ?;";
		try {
			PreparedStatement pstm=con.prepareStatement(sql);
			pstm.setString(1, "%"+end);
			ResultSet rs=pstm.executeQuery();
			while(rs.next()) {
				list.add(new Student(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4),rs.getString(5)));
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return list;
	}
	public boolean exit() {
		boolean flag=false;
		try {
			con.close();
			flag=true;
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}
	

	
}
