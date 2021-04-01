import java.util.Scanner;

public class Kaup {
	int weight = 0;
	int height = 0;
	public void userInput() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("체중을 입력해주세요(kg) : ");
		String userInputText = scanner.nextLine();
		weight = Integer.parseInt(userInputText);
		
		System.out.println("신장을 입력해주세요(cm) : ");
		String userInputText2 = scanner.nextLine();
		height = Integer.parseInt(userInputText2);
	}
	public void calcKaup() {
		double height2 = (double)height / 100;
		double kaup = (double)weight / (height2 * height2);
		
		if (kaup >= 30) {
			System.out.println("비만");
		} else if (kaup >= 24) {
			System.out.println("과체중");
		} else if (kaup >= 20) {
			System.out.println("정상");
		} else if (kaup > 15) {
			System.out.println("저체중");
		} else if (kaup >= 13) {
			System.out.println("여윔");
		} else if (kaup >= 10) {
			System.out.println("영양 실조증");
		} else {
			System.out.println("소모증");
		}
	}
}
