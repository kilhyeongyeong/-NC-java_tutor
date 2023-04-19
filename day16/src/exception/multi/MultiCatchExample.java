package exception.multi;

import java.util.Scanner;

public class MultiCatchExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println(new StringBuffer("1번째 데이터 : "));
			String data1 = sc.next();
			System.out.println(new StringBuffer("2번째 데이터 : "));
			String data2 = sc.next();
			
			// NumberFormatException 발생 가능
			int i = Integer.parseInt(data1);
			int j = Integer.parseInt(data2);
			
			// ArithmeticException 발생 가능
			int result = i / j;
			System.out.println(
					new StringBuffer(i)
							.append("/")
							.append(j)
							.append("=")
							.append(result));
			
			// NullPointException 발생 가능
			String str = null;
			str.charAt(0);
		}catch(NumberFormatException e) {
			System.err.println(new StringBuffer("데이터를 숫자만 넣어주세요"));
		}catch(ArithmeticException e) {
			System.err.println(new StringBuffer("0으로 나눌 수 없습니다."));
		}catch(Exception e) {
			System.err.println(new StringBuffer("알 수 없는 에러가 발생했습니다"));
			System.err.println(new StringBuffer("복구중 입니다."));
		}finally {
			sc.close();
		}
	}

}
