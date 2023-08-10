package my.shop;

import java.util.ArrayList;
import java.util.Scanner;

public class MyShop implements IShop {
	
	User[] users = new User[2];
	
	Product[] products = new Product[4];
	
	ArrayList<Product> cart = new ArrayList<Product>();
	
	Scanner sc = new Scanner(System.in);
	
	int selUser;
	
	String title;

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public void genUser() {
		User user = new User("홍길동", PayType.CARD);
		users[0] = user;
		
		user = new User("홍길동", PayType.CARD);
		users[1] = user;
	}

	@Override
	public void genProduct() {
		CellPhone cp = new CellPhone("갤럭시 노트5", 1000000, "SKT");
		products[0] = cp;
		cp = new CellPhone("애플 아이폰7", 9800000, "KT");
		products[1] = cp;
		SmartTV st = new SmartTV("삼성 3D Smart TV", 5000000, "4K");
		products[2] = st;
		st = new SmartTV("LG Smart TV", 2500000, "Full HD");
		products[3] = st;
		
	}

	@Override
	public void start() {
		System.out.println(title + " : 메인화면 - 계정선택");
		System.out.println("================================");
		int i = 0;
		
		for(User u : users) {
			System.out.printf("[%d]%s(%s)\n", i++, u.getName(), u.getPayType());
		}
		
		System.out.println("[x]종 료");
		System.out.println("선택: ");
		String sel = sc.next();
		System.out.println("## " + sel + "선택 ##");
		
		switch(sel) {
			case "x": System.exit(0); break;
			default:
				selUser = Integer.parseInt(sel);
				productList();
		}
		
	}
	public void productList() {
		System.out.println(title + " : 상품 목록 - 상품 선택");
		System.out.println("================================");
		int i = 0;
		
		for(Product p : products) {
			System.out.println("[" + i + "]");
			p.printDetail();
			i++;
		}
		System.out.println("[h]메인화면");
		System.out.println("[c]체크아웃");
		System.out.println("선택: ");
		String sel = sc.next();
		System.out.println("## " + sel + "선택 ##");
		
		switch(sel) {
			case "h": start(); break;
			case "c": checkOut(); break;
			default:
				int psel = Integer.parseInt(sel);
				cart.add(products[psel]);
				productList();
			
		}
	}
	
	public void checkOut() {
		System.out.println(title + " : 체크아웃");
		System.out.println("================================");
		int total = 0;
		int i = 0;
		
		for(Product p : cart) {
			System.out.printf("[%d]%s(%s)\n" + i++ + p.pname, p.price);
			total = total + p.price;
		}
		System.out.println("================================");
		System.out.println("결제 방법: " + users[selUser].getPayType());
		
		System.out.println("합계: " + total + " 원 입니다.");
		System.out.println("[p]이전, [q]결제 완료");
		System.out.print("선택: ");
		String sel = sc.next();
		
		switch(sel) {
		case "q":
			System.out.println("## 결제가 완료되었습니다. 종료합니다. ##");
			System.exit(0); break;
		case "p": productList(); break;
		default:
			checkOut();
		}
	}

}
