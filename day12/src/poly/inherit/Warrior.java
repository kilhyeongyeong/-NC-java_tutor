package poly.inherit;

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
		this.hp  = INIT_HP ;
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
	
	// 사냥
	public void hunt(Monster monster) {
		// 죽었는지 상태 확인 
		if(monster.getHp() <= 0) {
			System.out.println("이미 죽어서 공격할 수 없습니다.");
			System.out.println("----------------");	
			return;
		}
		
		// 공격
		monster.setDamagedHp(atk);
		if(!monster.isAttackedInactive(atk)) {
			System.out.println(monster.getName() + "을(를) 죽였습니다.");
			exp += monster.getExp();
		}else {
			if(monster.getAtk() > 0) {
				if(monster.getAtk() - def < 1) {
					hp--;
				}else {
					hp -= (monster.getAtk() - def);
				}
			}
//			hp -= monster.getAtk();
			System.out.println(monster.getName() + "을(를) 공격했습니다.");
		}
		System.out.println("----------------");
		
	}
}
