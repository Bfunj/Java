package Sub04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 2022.09.14
 * 백현조
 * preparedStatement 실습하기
 * 
 */
public class PreparedTest {
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
			String sql = "INSERT INTO `User1` VALUES (?,?,?,?);";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, "a201");
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "010-1110-2221");
			pstmt.setInt(4, 29);
			
			// 4단계 - SQL 실행
			
			pstmt.executeUpdate();
			
			// 5단계 - 결과처리 ( SELECT 경우

			
			
			// 6단계 - DATABASE 종료	
			pstmt.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
			
			System.out.println("insert 완료..");
	}
	
}
