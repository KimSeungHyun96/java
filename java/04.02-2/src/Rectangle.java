import java.util.Scanner;

public class Rectangle extends Base {
	double width = 0;
	double height = 0;
	
	Rectangle(String name) {
		super(name);
	}
	
	@Override
	public void inputData() {
		System.out.println();
		System.out.println("------ " + this.name + " ------");
		Scanner scanner = new Scanner(System.in);
		System.out.println("넓이를 입력해주세요.");
		String inputText = scanner.nextLine();
		this.width = Double.parseDouble(inputText);
		System.out.println("높이를 입력해주세요.");
		inputText = scanner.nextLine();
		this.height = Double.parseDouble(inputText);
	}
	
	@Override
	public void calcArea() {
		this.areaSize = this.width * this.height;
	}
}
