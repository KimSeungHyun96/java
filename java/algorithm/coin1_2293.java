package BackJoon;

import java.io.FileInputStream;
import java.util.Scanner;

public class coin1_2293 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/BackJoon_2293.txt"));
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt(); // 동전 종류 3
		int k = sc.nextInt(); // 동전 가치의 합 10
		
		int[] coin = new int[n + 1];
		for (int i = 1; i <= n; i++) {
			coin[i] = sc.nextInt(); // coin 배열에 값을 넣어줌 [1, 2, 5]
		}
		
		int[] dp = new int[k + 1];
		dp[0] = coin[1]; // 처음부터 시작
		for (int i = 1; i <= n; i++) { // 1~3반복 [1, 2, 5]
			for (int j = coin[i]; j <= k; j++) { // 2~10까지
				dp[j] = dp[j] + dp[j - coin[i]];  
			}
		}
		System.out.println(dp[k]);
		sc.close();
	}
}
