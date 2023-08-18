import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionExample {

	public static void main(String[] args) throws SQLException {
		
		// 1. DB연결
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/mydb";
		String id = "root";
		String pwd = "1234";
		PreparedStatement pst2 = null;
		
		try {
			// 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection(url, id, pwd);
			
			System.out.println("연결 성공");
			
			//2. users 테이블에 사용자 정보(데이터) 저장하기
//			String sql = "INSERT INTO users (userid, username, userpassward, userage, useremail) " 
//			+  "VALUES (?, ?, ?, ?, ?);";
			
			//2.2 boards 테이블에 새로운 게시물 정보(데이터) 저장하기
			String sql2 = "INSERT INTO boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata) " 
					+  "VALUES (?, ?, ?, now(), ?, ?);";
			
			// 3. 전송객체
//			PreparedStatement pst = con.prepareStatement(sql);
//			pst.setString(1, "spring");
//			pst.setString(2, "봄");
//			pst.setString(3, "12345");
//			pst.setInt(4, 25);
//			pst.setString(5, "sp@a.net");
			
			// 3.3 전송객체
			pst2 = con.prepareStatement(sql2, Statement.RETURN_GENERATED_KEYS);
			pst2.setString(1, "비 오는 날");
			pst2.setString(2, "함박눈이 내려요");
			pst2.setString(3, "winter");
			pst2.setString(4, "a.txt");
			pst2.setBlob(5, new FileInputStream("a.txt"));
			
			// 4. 데이터 전송하기
			//int n = pst.executeUpdate();
			
			int n1 = pst2.executeUpdate();
			
			if(n1 == 1) {
				System.out.println("저장 성공");
				
				// 현재 row의 bno값을 확인하기
				ResultSet rs = pst2.getGeneratedKeys();
				
				if(rs.next()) {
					int no = rs.getInt(1);
					//String title = rs.getString("btitle");
					System.out.println("저장된 bno: " + no);
					//System.out.println("저장된 btitle: " + title);
				}
				rs.close();
			}else {
				System.out.println("저장 실패");
			}
			
		}catch(Exception e) {
			System.out.println("연결 실패");
			e.getMessage();
		}finally {
			if(con != null) {
				try {
					con.close();
					System.out.println("연결 끊기");
					
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			//
			
		}

	}

}
