package BackJoon;

import java.util.Arrays;
import java.util.Scanner;
// 5
// 3 1 4 3 2 
public class ATM_11399 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] arr = new int[N]; // 배열 생성(5)
		for (int i = 0; i < N; i++) { // 0~4까지 반복
			arr[i] = sc.nextInt(); // arr[i]에 값을 넣어줌
		}
		Arrays.sort(arr); // arr배열 오름차순 정렬 [1, 2, 3, 3, 4]
//		System.out.println(Arrays.toString(arr)); // 확인용
		int time = 0; // 대기시간 저장
		int sum = 0; // 합 저장
		
		for (int i = 0; i < N; i++) { // 0~4까지 반복
			sum += time + arr[i]; // sum = 0+1
			time += arr[i]; // time = 1
		}
		System.out.println(sum);
}
}