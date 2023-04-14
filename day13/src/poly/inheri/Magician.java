package poly.inheri;

public class Magician {
	// 정보은닉 적용
	private String id ; // 아이디
	private int    hp ; // 체력
	private int    atk; // 공격력
	private int    def; // 방어력
	private int    exp; // 경험치
	
	// 초기화 상수
	public static final int INIT_HP  = 20;
	public static final int INIT_ATK =  2;
	public static final int INIT_DEF =  0;
	public static final int INIT_EXP =  0;
	
	// 생성자 - 변수 초기화
	// 입력 : id
	// 기본 설정 : 체력=20, 공격력=2, 방어력=0, 경험치=0
	public Magician(String id) {
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
	
	// 공격
	public void hunt(Monster monster) {
		// 죽었는지 상태 확인 
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		
		// 공격
		monster.setAfterAttackedHP(atk);
		if(monster.isInactiveAfterNextAttack(atk)) {
			showMonsterNowDeadMessage(monster.getName());
			gainMonsterExp(monster);
		}else {
			setHpAfterMonsterAttack(monster);
			showMonsterCounterAttackMessage(monster.getName());
		}
		System.out.println("----------------");
	}
	
	// 마법 공격
	public void caseFireball(Monster monster) {
		// 죽었는지 상태 확인 		
		if(monster.isInactive()) {
			showMonsterAlreadyDeadMessage(monster.getName());
			return;
		}
		
		// 공격
		monster.setAfterAttackedHP(atk*2);
		if(monster.isInactiveAfterNextAttack(atk*2)) {
			showMonsterNowDeadMessage(monster.getName());
			gainMonsterExp(monster);
		}else {
			setHpAfterMonsterAttack(monster);
			showMonsterCounterAttackMessage(monster.getName());
		}
		System.out.println("----------------");
	}
	
	// 사냥 후 경험치 획득
	public void gainMonsterExp(Monster monster) {
		exp += monster.getExp();		
	}
	
	
	// 몬스터의 반격으로 인한 체력 감소
	public void setHpAfterMonsterAttack(Monster monster) {
		if(monster.getAtk() > 0) {
			if(monster.getAtk() - def < 1) {
				hp--;
			}else {
				hp -= (monster.getAtk() - def);
			}
		}
	}
	
	// 각종 메세지
	public void showMonsterAlreadyDeadMessage(String monsterName) {
		System.out.println(monsterName + "은(는) 이미 죽어서 공격할 수 없습니다.");
		System.out.println("----------------");	
	}
	
	public void showMonsterNowDeadMessage(String monsterName) {
		System.out.println(monsterName + "을(를) 죽였습니다.");
	}
	
	public void showMonsterCounterAttackMessage(String monsterName) {
		System.out.println(monsterName + "을(를) 공격했습니다.");
	}
	
}
