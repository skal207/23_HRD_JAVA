package my.chat;

import java.net.Socket;

public class ClientExample {
	
	// 소켓
	static Socket socket;
	
	public static void main(String[] args) {
		
		try {
			socket = new Socket("127.0.0.1", 50001);
			System.out.println("클라이언트 연결 성공");
			
			socket.close();
			System.out.println("클라이언트 연결 끊음");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
