package poly.instanceof_;

public class Cup {
	
	private String itemName   ; //상품명
	private String companyName; // 가격
	private int    price	  ; // 제조사
	
	public static final String INIT_COM_NM = "컵회사";
	
	public Cup(String itemName, int price) {
		this.itemName 	 = itemName	  ;
		this.price	  	 = price   	  ;
		this.companyName = INIT_COM_NM;
	}
	
	public Cup() {
		this("입력안됨", 0);
	}

}
