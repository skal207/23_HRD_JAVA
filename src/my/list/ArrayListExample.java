package my.list;

import java.util.List;
import java.util.Vector;

class Board {
	private String subject;
	private String content;
	private String writer;

	public Board(String subject, String content, String writer) {
		super();
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}
}

public class ArrayListExample {

	public static void main(String[] args) {

		// 제너릭 타입
		List<Board> list = new Vector();

		Thread thradA = new Thread() {
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		Thread thradB = new Thread() {
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					list.add(new Board("제목" + i, "내용" + i, "글쓴이" + i));
				}
			}
		};

		thradA.start();
		thradB.start();
		
		// 작업 스레드들이 모두 종료될떄 까지 메인 스레드를 기다리게 함
		try {
			thradA.join();
			thradB.join();
		}catch(Exception e) {
			
		}

//		list.add(new Board("제목1", "내용1", "작성자1"));
//		list.add(new Board("제목2", "내용2", "작성자2"));
//		list.add(new Board("제목3", "내용3", "작성자3"));
//		list.add(new Board("제목4", "내용4", "작성자4"));
//		list.add(new Board("제목5", "내용5", "작성자5"));

		// 리스트에 저장된 개시물수 얻어오기
		int n = list.size();
		System.out.println("총 객체수: " + n);

		// 특정 인덱스의 객체 가져오기
//		Board board = list.get(2);
//		System.out.println(board.getSubject() + "\t" + board.getContent() + "\t" + board.getWriter());
//
		System.out.println();

		// 모든 객체를 하나씩 가져오기
//		for (int i = 0; i < list.size(); i++) {
//			Board b = list.get(i);
//			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
//		}
//
//		System.out.println();

//		list.remove(2);
//		list.remove(2);

		// for -each문
//		for (Board b : list) {
//			System.out.println(b.getSubject() + "\t" + b.getContent() + "\t" + b.getWriter());
//		}

	}

}
