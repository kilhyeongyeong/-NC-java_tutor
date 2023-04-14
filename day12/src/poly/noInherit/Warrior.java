package poly.noInherit;

public class Warrior {
	// 정보은닉 적용
	private String id ; // 아이디
	private int    hp ; // 체력
	private int    atk; // 공격력
	private int    def; // 방어력
	private int    exp; // 경험치
	
	// 초기화 상수
	public static final int INIT_HP  = 20;
	public static final int INIT_ATK =  3;
	public static final int INIT_DEF =  1;
	public static final int INIT_EXP =  0;
	
	// 생성자 - 변수 초기화
	// 입력 : id
	// 기본 설정 : 체력=20, 공격력=3, 방어력=1, 경험치=0
	public Warrior(String id) {
		this.id  = id;
		this.hp  = INIT_HP;
		this.atk = INIT_ATK;
		this.def = INIT_DEF;
		this.exp = INIT_EXP;
	}
	
	// 캐릭터 상태 조회
	public void showStatus() {
		System.out.println("아이디 : " 	+ id );
		System.out.println("체력  : "		+ hp );
		System.out.println("공격력 : " 	+ atk);
		System.out.println("방어력 : " 	+ def);
		System.out.println("경험치 : " 	+ exp);
		System.out.println("----------------");
	}
	
	// 토끼 사냥
	public void huntRabbit(Rabbit rabbit) {
		
		// 상태 확인
		if(rabbit.getHp() <= 0) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			System.out.println("----------------");	
			return;
		}
		
		// 공격 -> Rabbit.hp = -3
		rabbit.setHp(rabbit.getHp() - atk);
		if(rabbit.getHp() <= 0) {
			System.out.println("토끼를 죽였습니다.");
			exp += 5;
		}else {
			System.out.println("토끼를 공격했습니다..");
		}
		System.out.println("----------------");		
	}
	
	// 쥐 사냥
	public void huntRat(Rat rat) {
		
		// 상태 확인
		if(!rat.isRatActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			System.out.println("----------------");	
			return;
		}
		
		// 공격
		rat.setDamagedHp(atk);
		if(!rat.isAttackedRatInactive(atk)) {
			System.out.println("쥐를 죽였습니다.");
			exp += 80;
		}else {
			hp -= rat.getAtk();
			System.out.println("쥐를 공격했습니다.");
		}
		System.out.println("----------------");
	}
	
	// 돼지 사냥
	public void huntPig(Pig pig) {
		
		// 상태 확인
		if(!pig.isActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			System.out.println("----------------");	
			return;
		}
		
		// 공격
		pig.setDamagedHp(atk);
		if(!pig.isAttackedInactive(atk)) {
			System.out.println("돼지를 죽였습니다.");
			exp += 100;
		}else {
			hp -= pig.getAtk();
			System.out.println("돼지를 공격했습니다.");
		}
		System.out.println("----------------");
	}
	
	
	// 귀신 사냥
	public void huntGhost(Ghost ghost) {
		
		// 상태 확인
		if(!ghost.isActive()) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			System.out.println("----------------");	
			return;
		}
		
		// 공격
		ghost.setDamagedHp(atk);
		if(!ghost.isAttackedInactive(atk)) {
			System.out.println("귀신을 죽였습니다.");
			exp += 100;
		}else {
			hp -= ghost.getAtk();
			System.out.println("귀신을 공격했습니다.");
		}
		System.out.println("----------------");
	}
}
