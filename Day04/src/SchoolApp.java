import java.util.ArrayList;

public class SchoolApp {

	public static void main(String[] args) {
		
		Student st1 = new Student();
		st1.set학과("정보통신전자공학과");
		st1.set학번("20181525");
		st1.set수강과목("자바");
		
		System.out.println("학생1의 학번: " + st1.get학번());
		
		st1.showInfo();
		
		ArrayList<Student> list = new ArrayList<Student>();
		
		list.add(st1);
		list.add(new Student("컴퓨터공학과", "20204949", "파이썬"));
		
		System.out.println(list.size());
		
		for(Student s : list) {
			
			s.showInfo();
			
		}
		
	}

}
