package sub08;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

class User{
	private String uid;
	private String name;
	private String hp;
	private int age;
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid=uid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getHp() {
		return hp;
	}
	public void setHp(String hp) {
		this.hp = hp;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String toString() {
		return uid+","+name+","+hp+","+age;
		}
	
}
public class _10 {
	private static String host = "jdbc:mysql://127.0.0.1:3306/java1db";
	private static String user = "root";
	private static String pass = "1234";
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException{
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(host,user,pass);
	}
	
	public static void main(String[] args) {
		query("INSERT INTO `User3` VALUES ('j101','홍길동','010-1111-1111',21)");
		System.out.println("데이터 입력완료...");
		
		List<User> result1 =query("select * from `User3`");
		List<User> result2 =query("select * from `User3` where `uid`='j101'");
		
		System.out.println("--------------------");
		System.out.println("result1 결과");
		for(User user : result1) {
			System.out.println(user);
		}
		
		System.out.println("--------------------");
		System.out.println("result2 결과");
		for(User user : result2) {
			System.out.println(user);
		}
		
	}
	
	
	public static List<User> query(String sql){
		
		List<User> users = new ArrayList<>();	
		Statement stmt =null;
		ResultSet rs=null;
		
		try {
			stmt = getConnection().createStatement();
					
					if(sql.toLowerCase().startsWith("select")) {
						rs= stmt.excuteQuery(sql);
								
								while(rs.next()) {
									User user = new User();
									user.setUid(rs.getString(1));
									user.setName(rs.getString(2));
									user.setHp(rs.getString(4));
									user.setAge(rs.getInt(4));
									users.add(user);
								}
					}else {
						stmt.executeUpdate(sql);
					}
			
		}catch(Exception e) {
			e.printStackTrace();
		}return users;
	}
}
