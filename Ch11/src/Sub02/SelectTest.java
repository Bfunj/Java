package Sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectTest {
	public static void main(String[] args) {
		// DB 정보
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
		
			try { 
			// 1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host,user,pass);
			
			// 3단계 - SQL실행객체 생성
			Statement stmt = conn.createStatement();
			
			
		
			
			// 4단계 - SQL 실행
			String sql = "SELECT *FROM `User1`; ";
			ResultSet rs = stmt.executeQuery(sql);
			// select 할 경우에는 executeQuery로 할 것
			
			// 5단계 - 결과처리 ( SELECT 경우
			while(rs.next()) {
				/*
				String uid = rs.getString("uid");
				String name = rs.getString("name");
				String hp = rs.getString("hp");
				int age = rs.getInt("age");
				
				System.out.println(uid+"," + name+"," + hp+"," + age);
				*/
				System.out.println("---------------");
				System.out.printf("%s,%s,%s,%d\n", rs.getString(1),
												rs.getString(2),
												rs.getString(3),
												rs.getInt(4)
												);
				
			}
			
			
			// 6단계 - DATABASE 종료
			rs.close();
			stmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
			System.out.println("insert 완료..");
	}
	
}