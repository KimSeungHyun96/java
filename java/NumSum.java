// 숫자(자연수)가 입력으로 주어지면, 
// 각 자릿수의 합을 더하여 출력하는 불완전한 함수를 완성
// 예를 들어 입력 숫자가 1013 이면 1+0+1+3 = 5를 리턴

import java.util.Scanner;

public class NumSum {
	public static void main(String[] args) {
		// 스캐너를 사용
		Scanner sc = new Scanner(System.in);
		// Input를 입력값으로 사용
		int Input = sc.nextInt();
		// 빈값을 담을 sum을 만들어줌
		int sum = 0;
		
		while(Input >0) { // 반복문 Input가 0보다 클때 (0일때는 0 출력)
			sum += Input%10; // 입력받은 값에 10을 나누었을 때 나머지를 저장
			Input = Input / 10; // 입력받은 값을 10으로 나누었을 때 몫을 Input로 이용시키고 다시 반복
			}
		System.out.println(sum);
		}
	}
