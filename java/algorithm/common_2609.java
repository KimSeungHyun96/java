package BackJoon;

import java.io.FileInputStream;
import java.util.Scanner;
// 24 18
public class common_2609 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/BackJoon_2609.txt"));
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int M = sc.nextInt();
		
		int GCD = N % M; // 최소공배수
		int LCM = GCD * (N/GCD) * (M/GCD); // 최대공약수
		System.out.println(GCD);
		System.out.println(LCM);
		
	}
}
