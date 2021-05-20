package BackJoon;

import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

// 20 7 23 19 10 15 25 8 13
public class Short_2309 {
	public static void main(String[] args) {
//		System.setIn(new FileInputStream("src/BackJoon_2309.txt"));
		Scanner sc = new Scanner(System.in);
		int shortA = 0, shortB = 0;
		int[] arr = new int[9];
		int sum = 0;
		for (int i = 0; i < arr.length; i++) { // 난쟁이 키 입력
			arr[i] = sc.nextInt();
			sum += arr[i]; // sum은 난쟁이 9명의 키의 합
		}
		Arrays.sort(arr); //키를 오름차순으로 정렬
		
		for(int a = 0; a < arr.length-1; a++) { // 모든경우의 수 arr의 길이-1 > arr의 길이 (난쟁이3명이면 for문 3개)
			for(int b = a+1; b < arr.length; b++) {
				if(sum - arr[a] - arr[b] == 100) { //핵심
					shortA = a;
					shortB = b;
					break;
				}
			}
		}
		for(int j = 0; j < arr.length; j++) { // 진짜 난쟁이 키 출력
			if(j == shortA || j == shortB) //주의
				continue;
			System.out.println(arr[j]);
		}
	}
}