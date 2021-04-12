/* 
2
3 10 10 1 5 6 8 2 17
4 3 3 2 1 4 2 5 3 4 5
*/
import java.util.Arrays;
import java.util.Scanner;
import java.io.FileInputStream;


class Practice {
	static int N;
	static int AnswerN;

	public static void main(String args[]) throws Exception {
		System.setIn(new FileInputStream("src\\input.txt"));
		Scanner sc = new Scanner(System.in);
		

		int T;
		T = sc.nextInt(); 

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt(); 
			char[] E = sc.nextLine().toCharArray();
			
			int number[][] = new int[N][2];
			int foxX = sc.nextInt();
			int foxY = sc.nextInt();
			
			for(int i=0; i<number.length; i++) {
				for(int j=0; j<number[i].length; j++) {
					System.out.print(number[i][j]);
			}
				 System.out.println();
		}

			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}


