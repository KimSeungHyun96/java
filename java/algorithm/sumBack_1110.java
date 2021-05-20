package BackJoon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class sumBack_1110{
//	26
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = 0;
		int b = 0;
		int c;
//		계산을 원하는 숫자를 문자형 배열로 받았다
		String[] E = sc.nextLine().split("");
//		 문자형 배열을 정수형 배열으로 변환해주었다.
		int[] intArray = Stream.of(E).mapToInt(Integer::parseInt).toArray();
//		 최초 사용자 입력값에서 숫자를 인덱싱하기위해서 한자리 숫자가 들어오면 첫째자리(a)의 숫자는 0으로
//		 둘째 숫자(b)는 입력값을 그대로 사용
		if (E.length == 1) {
			a = 0;
			b = intArray[0];
			// 그외 두자리 숫자로 들어올 경우에는 정수형 배열에 담겨있는 순서대로 사용하면 된다.
		} else {
			a = intArray[0];
			b = intArray[1];
		}
//		최초 사용자 입력값을 한자리씩 문자형으로 변환하여 붙여서 result변수에 대입했다.
		String result = String.valueOf(a) + String.valueOf(b);
//		초기 a와 b의 합을 c에 대입해주었다.
		c = a + b;
//		System.out.println(c);
//		결과값을 비교해주기 위해서 result2라는 문자형 변수를 비워놓고 반복문에 의해 계속 변경해준다.
		String result2 = "";
//		횟수를 카운트하기위한 정수형 변수
		int cnt = 0;
//		무한반복
		while (true) {
			cnt++;
//			a+b의 값이 10보다 크다면 10을 빼고 c에 대입한다.
//			어짜피 20을 넘는숫자는 나오지 않기때문에 10~18사이의 두자리숫자만 고려하면된다.   
			if (c >= 10) {
				c = c - 10;
			}
//			결과숫자는 b와 c 숫자를 문자형으로 변환하여 붙여준 문자형 변수에 대입한다.
			result2 = String.valueOf(b) + String.valueOf(c);
			if (result.equals(result2)) {
				break;
			}
			a = b;
			b = c;
			c = a + b;
		}
		System.out.println(cnt);
//		int a = 2;
//		int b = 6;
//		int[] n2 = new int[3];
//		n2[0] = a;
//		n2[1] =b;
//		n2[2] = a+b;
//		System.out.println(Arrays.toString(n2));
//		n2[0] = n2[1];
//		n2[1] = n2[2];
//		n2[2] = n2[0]+n2[1];
//		System.out.println(Arrays.toString(n2));
//		n2[0] = n2[1];
//		n2[1] = n2[2];
//		String numericStr = String.valueOf(n2[0]+n2[1]);
//		n2[2] = n2[0]+n2[1];
//		System.out.println(Arrays.toString(n2));

//		String numericStr = String.valueOf(n2[0])+String.valueOf(n2[1]);
//		System.out.println(numericStr);
//		System.out.println(numericStr.charAt(1));
//		int number = Integer.parseInt(numericStr);
//		n2[0] = 
//		String numericStr = "123";
//		Integer number = 0;
//		number = Integer.parseInt(numericStr);

//		 Integer number = 123;
//		 String numericStr = "";
//		 numericStr = String.valueOf(number);
//		 numericStr = Integer.toString(number);
//		 numericStr = "" + number;

	}

}
