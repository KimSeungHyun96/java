package BackJoon;

import java.io.FileInputStream;
import java.util.Scanner;

public class Paper_2563 {
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("src/BackJoon_2563.txt"));
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();

		int[][] map = new int[100][100]; // 가로:100 세로:100 도화지

		int cnt = 0;
		for (int i = 1; i <= T; i++) { // 색종이의 개수(3)
			int X = sc.nextInt(); // X의 값을 받음
			int Y = sc.nextInt(); // Y의 값을 받음

			for (int a = X; a < X + 10; a++) { 
				for (int b = Y; b < Y + 10; b++) {
					map[a][b] = 1; // 색종이 3개의 값을 1로 설정
				}
			}
		}
		for (int i = 0; i < 100; i++) { // 도화지크기
			for (int j = 0; j < 100; j++) {
				if (map[i][j] == 1) { // 빈도화지의 길이에 색종이의 값이 같다면 cnt++
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
