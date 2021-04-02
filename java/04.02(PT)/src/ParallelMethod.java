import java.util.Scanner;

public class ParallelMethod extends Base {
	double height = 0;
	double baseLine = 0;

	public ParallelMethod(String name) {
		super(name);
	}

	public void inValue() {
		Scanner scanner = new Scanner(System.in);
		super.inValue();
		System.out.println("밑변을 입력하세요 : ");
		String userInput = scanner.nextLine();
		this.baseLine = Double.parseDouble(userInput);

		System.out.println("높이을 입력하세요 : ");
		userInput = scanner.nextLine();
		this.height = Double.parseDouble(userInput);
	}

	public void outValue() {
		super.result = this.baseLine * this.height;
		System.out.println(this.name + "의 넓이는 : " + this.result);
	}
}
