
public class ExecClass {
	public static void main(String[] args) {
//		Base triangle = new Triangle("삼각형");
//		Base rectangle = new Rectangle("사각형");
//		Base circle = new Circle("원");
		
		Base[] poligon = {new Triangle("삼각형"), new Rectangle("사각형"), new Circle("원")};
		
		for (int i = 0; i < poligon.length; i++) {
			poligon[i].inputData();
			poligon[i].printSize();
		}
	}
}
