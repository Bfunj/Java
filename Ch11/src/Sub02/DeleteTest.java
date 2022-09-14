package Sub02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 
 * 
 * 
 */
public class DeleteTest {
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
			String sql = "DELETE FROM `User1` where `uid` = 'a101';";
			stmt.executeUpdate(sql);
			
			// 5단계 - 결과처리 ( SELECT 경우

			
			
			// 6단계 - DATABASE 종료	
			stmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
			System.out.println("삭제 완료..");
	}
	
}
