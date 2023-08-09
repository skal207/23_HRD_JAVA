package my.day05.exam6;

import java.util.ArrayList;

public class GameCharactorTest {

	public static void main(String[] args) {
		
		Wizard wz = new Wizard();
		wz.name = "간달프";
		wz.hp = 100;
		wz.mp = 80;
//		wz.punch();
//		wz.fireball();
		
		Knight kn = new Knight();
		kn.name = "킹아서";
		kn.hp = 120;
		kn.stamina = 200;
//		kn.punch();
//		kn.slash();
		
		ArrayList<Novice> gamelist = new ArrayList<Novice>();
		
		gamelist.add(kn);
		gamelist.add(wz);
		
		for(Novice n: gamelist) {
			if(n instanceof Knight) {
				((Knight)n).slash();
			}else if(n instanceof Wizard) {
				((Wizard)n).fireball();
			}
		}
		
	}

}

class Novice {
	
	String name;
	int hp;
	
	void punch() {
		System.out.printf("%s(HP: %d)의 펀치!\n", name, hp);
	}
}

class Wizard extends Novice{
	
	int mp;
	
	public void fireball() {
		System.out.printf("%s(MP: %d)의 파이어볼!\n", name, mp);
	}

}

class Knight extends Novice{
	
	int stamina;
	
	public void slash() {
		System.out.printf("%s(STAMINA: %d)의 베기공격!\n", name, stamina);
	}
}
