package my.day05.exam9;

import java.util.Scanner;

public class Student extends Person {
	
	private String sID;
	private String className;
	
	public String personInfo() {
		String info = super.personInfo();
		info += "\n학번: " + sID + "\n수강과목: " + className;
		return info;
	}

	@Override
	public String getId() {
		return sID;
	}

	@Override
	public void setId(String id) {
		sID = id;
	}


	public String getsID() {
		return sID;
	}
	
	public void setsID(String sID) {
		this.sID = sID;
	}
	
	public void inputInfo() {
		super.inputInfo();
		System.out.println("학번을 입력하세요=> ");
		Scanner sc = new Scanner(System.in);
		String sid = sc.next();
		setsID(sid);
		
		System.out.println("수강과목을 입력하세요=> ");
		String cn = sc.next();
		setClassName(cn);
	}
	
	public String getClassName() {
		return className;
	}
	
	public void setClassName(String className) {
		this.className = className;
	}
	
}
