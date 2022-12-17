package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn1 {
	public static void main(String[] args) {		// Shift + Tab : 반대로 들여쓰기
		// 데이터베이스 라이브러리 추가하기
		// 프로젝트 우클릭 -> Properties -> Java Build Path -> Classpath -> Add External JARs... -> mysql-connector-j-8.0.xx.jar(ojdbc6.jar)
		// MySQL 설치 경로 : C:\Program Files (x86)\MySQL\Connector J 8.0
		MyDB1 db = new MyDB1();
		
//		db.connect();
//		db.insert();
		
//		db.connect();
//		db.update();
		
//		db.connect();
//		db.delete();
		
		db.connect();
		db.select();
	}
}

class MyDB1 {
	private Connection conn;
	private static final String USERNAME = "root";
	private static final String PASSWORD = "root";
	private static final String URL = "jdbc:mysql://localhost:3306/company";	// 스키마명
	
	// DB 라이브러리 실행
	public MyDB1() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");		// MySQL 8버전 (5버전이면 cj.를 뺌)
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// DB 접속
	public void connect() {
		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	// CRUD : Create, Read, Update, Delete - 추가하고, 읽고, 수정하고, 삭제하고
	// 		  insert, select, update, delete
	
	// select : 검색(read)
	public void select() {
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			stmt = conn.createStatement();
			String sql = "SELECT * FROM worker";		// select All
			rs = stmt.executeQuery(sql);
			while(rs.next()) {			// 위에서부터 한 행씩 반복문
				int id = rs.getInt(1);		// 첫번째 열의 값을 가져오겠다.
				String name = rs.getString(2);		// 두번째 열 값을 가져오겠다.
				String gender = rs.getString(3);	// 세번째 열 가져오겠다.
				
				System.out.println(id+". "+name+" "+gender);		// 한 행씩 실행할 때마다 출력
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// insert : 입력
	public void insert() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "INSERT INTO worker (name, gender) VALUES ('orange', 'man')";
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("입력 성공");
			} else {
				System.out.println("입력 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// update : 수정
	public void update() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "UPDATE worker SET gender='woman' WHERE id='6'";
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("수정 성공");
			} else {
				System.out.println("수정 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	// delete : 삭제
	public void delete() {
		Statement stmt = null;
		try {
			stmt = conn.createStatement();
			String sql = "DELETE FROM worker WHERE id='6'";
			int result = stmt.executeUpdate(sql);
			if(result>0) {
				System.out.println("삭제 성공");
			} else {
				System.out.println("삭제 실패");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
}