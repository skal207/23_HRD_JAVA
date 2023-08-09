package my.day05.exam9;

import java.util.Scanner;

public class Teacher extends Person {
	
	private String tID;
	private String subject;
	
	public String personInfo() {
		String info = super.personInfo();
		info += "\n교번: " + tID + "\n가르치는 과목: " + subject;
		return info;
	}
	
	@Override
	public String getId() {
		return tID;
	}

	@Override
	public void setId(String id) {
		
	}

	public String gettID() {
		return tID;
	}

	public void settID(String tID) {
		this.tID = tID;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void inputInfo() {
		super.inputInfo();
		System.out.println("교번을 입력하세요=> ");
		Scanner sc = new Scanner(System.in);
		String tID = sc.next();
		settID(tID);
		
		System.out.println("가르치는 과목을 입력하세요=> ");
		String cn = sc.next();
		setSubject(cn);
	}
	

}
