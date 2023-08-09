package my.day05.exam9;

import java.util.Scanner;

public abstract class Person {
	
	private String name;
	private String id;
	
	public abstract String getId();
	public abstract void setId(String id);
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Person() {}
	
	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	}
	
	public void inputInfo() {
		System.out.println("이름을 입력하세요=>");
		Scanner sc = new Scanner(System.in);
		String nm = sc.next();
	}
	
	public String personInfo() {
		String info = "이름: " + name;
		return info;
	}
	
	public void printAll() {
		System.out.println(this.personInfo());
	}
	public String toString() {
		return name;
	}

}
