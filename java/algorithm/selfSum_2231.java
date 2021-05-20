package BackJoon;

import java.io.FileInputStream;
import java.util.Scanner;
// 216
public class selfSum_2231 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/Backjoon_2231.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // N에 216이 들어옴
		
		int result = 0;
		for (int i = 0; i < N; i++) { // 0 ~ 215
			int number = i; // number = 0 ~ 215
			
			int sum = 0; // 각 자릿수 합 변수
			// 1 ~ 215까지 반복하는데 216이 결과값으로 sum에 각 자리수를 더했을 때 나오는 최소값의 경우의 수(198)
			while(number > 0) { 
				// 각 자릿수 더하기
				sum += number % 10; // (나머지를 저장)
				number /= 10; // (몫을 나타냄) while문을 통해 다시 위에서 시작
			}
			// i 값과 각 자릿수 누적합이 같을 경우 (생성자를 찾았을 경우)
			if (sum + i == N) { // 198 + (1 + 9 + 8) = 216
				result = i; // 결과값에 저장
				break;
			}

		}

		System.out.println(result);
	}
}