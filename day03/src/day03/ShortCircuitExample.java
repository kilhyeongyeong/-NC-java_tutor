package day03;

public class ShortCircuitExample {

	public static void main(String[] args) {
		// &, | 은 모든 결과를 확인하고 넘어가기 때문에
		// 연산효율이 떨어지믈 일반적인 상황에서는 잘 사용하지 않습니다.
		
		// 거짓 & 3/0의 몫은 1이다 라는 명제(거짓 & ?)
		// 이미 false가 왼편에 와서 false가 확정이지만, 3/0을 수행해 에러가 발생함
		System.out.println(false && (3 / 0 == 1));
		System.out.println(true || (3 / 0 == 1));

	}

}
