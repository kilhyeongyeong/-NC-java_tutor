package day08;

public class CatMain {
	
//	public static class CatVO {
//		private String a;
//
//		public String getA() {
//			return a;
//		}
//
//		public void setA(String a) {
//			this.a = a;
//		}
//	} 


	public static void main(String[] args) {
		Cat c1 = new Cat("아항", 5, "숏헤어", "치즈");
		c1.showCatInfo();
		
		Cat c2 = new Cat("메롱", 15, "먼치킨", "흰색");
		c2.showCatInfo(); 
		
		CatVO vo = new CatVO();
		vo.getA();
		 
	}

}

class CatVO{
	private String a;

	public String getA() {
		return a;
	}

	public void setA(String a) {
		this.a = a;
	}
}
