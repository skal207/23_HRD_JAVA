import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardUpdateExample {

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
			
			//2.2 boards 테이블에 bno=3 게시물 정보(데이터) 수정하기
			//String sql2 = "UPDATE boards SET btitle=?, bcontent=?, bfilename=?, bfiledata=? WHERE bno=?";
			String sql3 = "DELETE FROM boards WHERE btitle = ?";
			
			// 3. 전송객체
//			PreparedStatement pst = con.prepareStatement(sql);
//			pst.setString(1, "spring");
//			pst.setString(2, "봄");
//			pst.setString(3, "12345");
//			pst.setInt(4, 25);
//			pst.setString(5, "sp@a.net");
			
			// 3.3 전송객체
			pst2 = con.prepareStatement(sql3);
			pst2.setString(1, "눈사람");
//			pst2.setString(2, "눈으로 만든 사람");
//			pst2.setString(3, "b.txt");
//			pst2.setBlob(4, new FileInputStream("b.txt"));
//			pst2.setInt(5, 3);
			
			// 4. 데이터 전송하기
			//int n = pst.executeUpdate();
			
			int n1 = pst2.executeUpdate();
			
			if(n1 == 1) {
				System.out.println("삭재 성공");
				
			}else {
				//System.out.println("해당 번호는 존재하지 않습니다.");
				System.out.println("삭재 실패");
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
