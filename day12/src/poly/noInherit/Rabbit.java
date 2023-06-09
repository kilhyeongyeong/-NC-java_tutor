package poly.noInherit;

public class Rabbit {
	private int hp ; // 체력
	private int atk; // 공격력
	private int def; // 방어력
	
	// 초기화 상수
	public static final int INIT_HP  = 3;
	public static final int INIT_ATK = 0;
	public static final int INIT_DEF = 0;
	
	// 생성자 - 변수 초기화
	// 기본 설정 : 체력=3, 공격력=0, 방어력=0
	public Rabbit() {
		hp  = INIT_HP ;
		atk = INIT_ATK;
		def = INIT_DEF;
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
