package BackJoon;

import java.util.Scanner;
// 26
public class sumBack2_1110 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        int cnt=0; // 카운터 저장
        int n = sc.nextInt(); // 스캐너 받을 n
        int num=n; // 변할 수 있는 num을 설정
        
        while(true) { // 26
        	a=num/10; b=num%10; // (/:몫 , %:나머지) a=2, b=6 
        	sum=a+b; // sum = 2+6
        	cnt++; 
        	num=b*10+sum%10; // num=(6*10)+(8%10 = 8) # num=68 반복문에 의해 다시 반복
        	if(n==num) { // 26 = 26 반복문 종료
        		break;
        	}
        }
        System.out.println(cnt);
    }
}