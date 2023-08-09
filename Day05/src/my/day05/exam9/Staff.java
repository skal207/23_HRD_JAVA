package my.day05.exam9;

import java.util.Scanner;

public class Staff extends Person {
	
	private String dept;
	private String id;
	
	public String personInfo() {
		String info = super.personInfo();
		info += "\n교번: " + id + "\n부서: " + dept;
		return info;
	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	public void inputInfo() {
		super.inputInfo();
		System.out.println("교번을 입력하세요=> ");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		setId(id);
		
		System.out.println("부서를 입력하세요=> ");
		String cn = sc.next();
		setDept(cn);
	}

}
