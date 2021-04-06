import java.util.Scanner;

public class Circle extends Base {
	
	double halfLine = 0;
			
	Circle(String name) {
		super(name);
	}
	
	public void inputData() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("반지름을 입력해주세요.");
		String inputText = scanner.nextLine();
		inputText = scanner.nextLine();
		this.halfLine = Double.parseDouble(inputText);
		
	}
	
	public void calcArea() {
		this.areaSize = halfLine * halfLine * Math.PI;
	}
}
