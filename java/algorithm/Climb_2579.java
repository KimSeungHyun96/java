package BackJoon;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Climb_2579 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/BackJoon_2579.txt"));
		Scanner sc = new Scanner(System.in);

		 
		int N = sc.nextInt();
 
		int[] arr = new int[N + 1];
		for (int i = 1; i <= N; i++) {
			arr[i] =sc.nextInt(); // [0, 10, 20, 15, 25, 10, 20]
		}
		System.out.println(Arrays.toString(arr));
		int[] DP = new int[N + 1];
		// index = 0 은 시작점이므로 0이다.		
		DP[1] = arr[1]; // 10

		if (N >= 2) {
			DP[2] = arr[1] + arr[2]; // 30 = 10 + 20
		}
 
		for (int i = 3; i <= N; i++) { // 3~6
			DP[i] = Math.max(DP[i - 2] , DP[i - 3] + arr[i - 1]) + arr[i];
			// Math.max 두 인자중 가장 값을 리턴 
			// i = 3; DP[3] = (10, 0+20) + 15 = 35 [0, 10, 30, 35, 0, 0, 0] 
			// i = 4; DP[4] = (30, 10+15) + 25 = 55 [0, 10, 30, 35, 55, 0, 0] 
			// i = 5; DP[5] = (35, 30+25) + 10 = 65 [0, 10, 30, 35, 55, 65, 0] 
			// i = 6; DP[6] = (55, 35+10) + 20 = 75 [0, 10, 30, 35, 0, 0, 0] 
		}
		System.out.println(Arrays.toString(DP)); // DP[i] = [0, 10, 30, 35, 55, 65, 75]
		System.out.println(DP[N]); // 75
	}
}

//int N = sc.nextInt();
//
//int[] arr = new int[N];
//for (int i = 0; i < N; i++) {
//	arr[i] = sc.nextInt();
//}
//Arrays.sort(arr); // 10 10 15 20 20 -(25) 
//
//int sum = 0;
//
//for (int i = 0; i < N-1; i++) {
//	sum += arr[i];
//}
//System.out.println(sum);