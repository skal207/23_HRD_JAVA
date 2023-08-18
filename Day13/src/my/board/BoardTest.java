package my.board;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BoardTest {
	
	// 필드
	Connection con = null;
	String url = "jdbc:mysql://localhost:3306/mydb";
	String id = "root";
	String pwd = "1234";
	
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	String sql = "";
	// 생성자
	public BoardTest() {
		connect();
	}
	
	public void connect() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("연결 성공"); 
			
		}catch(Exception e) {
			e.getMessage();
		}
	}
	
	// 게시물 전체 조회
	public void list() {
		//connect();
		try {
			sql = "SELECT bno, btitle, bcontent, bwriter, bdate FROM boards ORDER BY bno DESC";
			pst = con.prepareStatement(sql);
			
			rs = pst.executeQuery();
			
			while(rs.next()) {
				int no = rs.getInt(1);
				String title = rs.getString(2);
				String content = rs.getString(3);
				String writer = rs.getString(4);
				java.sql.Date date = rs.getDate(5);
				
				Board board = new Board(no, title, content, writer, date);
				System.out.printf("%-6s%-12s%-16s%-40s \n", no, title, content, writer, date);
			}
			rs.close();
			pst.close();
			
		}catch(Exception e) {
			e.getMessage();
		}
		
	}

	public static void main(String[] args) {
		
		BoardTest bt = new BoardTest();
		bt.list();

	}

}
