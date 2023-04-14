package poly.inheri;

public class Monster {
	
	private String name; // 이름
	private int	   hp  ; // 체력
	private int    atk ; // 공격력
	private int    def ; // 방어력
	private int    exp ; // 경험치
	
	// 생성자 - 변수 초기화
	public Monster(String name, int hp, int atk, int def, int exp) {
		this.name = name;
		this.hp   = hp  ;
		this.atk  = atk ;
		this.def  = def ;
		this.exp  = exp ;
	}
	
	// 해당 몬스터 사망 여부 check
	public boolean isInactive() {
		return hp > 0 ? false : true;
	}
	
	// 공격받은 뒤의 사망 여부 check
	public boolean isInactiveAfterNextAttack(int userAtk) {
		return hp > 0 ? false : true;
	}
	
	public void setAfterAttackedHP(int userAtk) {
		this.hp -= (userAtk - this.def);
	}

	// Getter/Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}
}
