import java.util.ArrayList;
import java.util.Scanner;

public class JobApp {
	
	// 속성...
	public JobApp() {
		
	}
	
	// 1. 메뉴 메소드 (반환타입과 매개변수 모두 없는 메소드 타입)
	public void showMenu() {
		System.out.println("**********JOB v1.1*************");
		System.out.println("** 1. 구직 등록            ");
		System.out.println("** 2. 구직자 정보 출력            ");
		System.out.println("** 5. 종료            ");
		System.out.println("********************************");
		System.out.println("메뉴 번호를 입력하세요=> ");
		System.out.println("********************************");
	}
	
	// 2. 사람의 정보를 입력 받는 메소드 (반환타입은 문자열, 매개변수는 없는 메소드 타입)
	public void inputPerson() {
		
		Scanner sc = new Scanner(System.in);
		// 이름, 나이, 성별, 전화번호를 입력받아 사람객체로 저장
		
		System.out.println("이름 입력>> ");
		String name = sc.next();
		
		System.out.println("나이 입력>> ");
		int age = sc.nextInt();
		
		System.out.println("-----성별 메뉴-----");
		System.out.println("1. 남자 | 2. 여자");
		System.out.println("-------------------");
		
		char sex;
		int n = sc.nextInt();
		if(n == 1) {
			sex = 'M';
		}else {
			sex = 'F';
		}
		
		System.out.println("전화번호 입력>> ");
		String tel = sc.next();
		//////////////////////////////////////////////////////////
	    Person person = new Person(name, age, sex, tel);
	    //////////////////////////////////////////////////////////
	    
	    ArrayList<Person> list = new ArrayList<Person>();
	    list.add(person);
	    
	    // 메소드 내에서 메소드 호출
	    String result = person.showProfile();
	    System.out.println(result);
	    
	}

	public static void main(String[] args) {
		
		JobApp jap = new JobApp();
		while(true) {
			jap.showMenu();
			
			Scanner sc = new Scanner(System.in);
			
			int num = sc.nextInt();
			
			if(num == 5) {
				
				System.out.println("정상종료");
				System.exit(0);
				
			}else if(num == 1) {
				
				jap.inputPerson();
				
			}//else if(num == 3)
		
		}

	}

}
