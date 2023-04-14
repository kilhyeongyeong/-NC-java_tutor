package poly.noInherit;

public class Rat {
	private int hp ; // 체력
	private int atk; // 공격력
	private int def; // 방어력
	
	// 초기화 상수
	public static final int INIT_HP  = 5;
	public static final int INIT_ATK = 1;
	public static final int INIT_DEF = 0;
	
	// 생성자 - 변수 초기화
	// 기본 설정 : 체력=5, 공격력=3, 방어력=0
	public Rat() {
		hp  = INIT_HP ;
		atk = INIT_ATK;
		def = INIT_DEF;
	}
	
	// 해당 몬스터 사망 여부 check
	public boolean isRatActive() {
		return hp > 0 ? true : false;
	}
	
	// 공격받은 뒤의 사망 여부 check
	public boolean isAttackedRatInactive(int userAtk) {
		return hp > 0 ? true : false;
	}
	
	public void setDamagedHp(int userAtk) {
		this.hp -= (userAtk - this.def);
	}
	
	// Getter/Setter
	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
