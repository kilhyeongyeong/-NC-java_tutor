package exception.custom;

public class Account {
	private long balance;
	
	public long getBalance() {
		return this.balance;
	}
	
	public void deposit(int money) throws DepositMinusMoneyException {
		if(money < 0) {
			throw new DepositMinusMoneyException(new StringBuffer("음수로 입금할 수 없음").toString());
		}
		this.balance += money;
	}
	
	public void withDraw(int money) throws BalanceInsufficientException{
		if(this.balance < money) {
			throw new BalanceInsufficientException(new StringBuffer("잔고부족").toString());
		}
		this.balance -= money;
	}
}
