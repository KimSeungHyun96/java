
public class ExecClass {
	public static void main(String[] args) {
		Triangle triangle = new Triangle("삼각형");
		Rectangle rectangle = new Rectangle("사각형");
		Circle circle = new Circle("원");
		
		triangle.inputData();
		rectangle.inputData();
		circle.inputData();
		
		
		triangle.printSize();
		rectangle.printSize();
		circle.printSize();
	}
}
