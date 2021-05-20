package BackJoon;

import java.io.FileInputStream;
import java.util.Scanner;

public class coin_11047 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/BackJoon_11047.txt"));
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt(); // 10개의 동전
		int M = sc.nextInt(); // 4200원
		
		int count = 0;
		
		int[] arr = new int[N]; // 10개의 동전이 들어갈 배열
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt(); // arr에 값을 넣어줌
		}

		for (int i = N - 1; i >= 0; i--) { // 뒤부터 계산
			if (M >= arr[i]) { // 4200원 보다 작거나 같으면
				count += M / arr[i]; 
				M = M % arr[i];
			}

		}

		System.out.println(count);

	}

}
