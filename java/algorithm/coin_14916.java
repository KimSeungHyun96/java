package BackJoon;

import java.util.Scanner;

public class coin_14916 {
	private static int calcY(int a, int b) {
		return 2 * a + 5 * b;
	}
	// 모든 경우의 수를 찾기 위한 로직
	public static void main(String[] args) {
		int N = 100000;
		// 반복해서 출력하게 끔 만듦
		while(true) {
			Scanner sc = new Scanner(System.in);
			int y = sc.nextInt();
			// 2a 와 5b의 최소값을 얻어야 함
			int minA = 0, minB = 0;
			int min = N+1;
			
			for (int a = 0; a <= ((N / 2)+1); a++) {
				for (int b = 0; b <= ((N / 5)+1); b++) {
					int tempY = calcY(a, b);
					if (y <= tempY && min > tempY) {
						min = tempY;
						minA = a;
						minB = b;
					}
				}
			}
			System.out.println(minB + minA);
		}
	}
}