
public class ShapeMain {
	public static void main(String[] args) {

		// 삼각형 : 임시진
		// 사각형 : 최성운
		// 평행사변형 : 백두용
		// 사다리꼴 : 김승현
		Base[] square = { new TriangleMethod("삼각형"), new SquareMethod("사각형"), new TrapazoidMethod("사다리꼴"),
				new ParallelMethod("평행사변형") };

		for (int i = 0; i < square.length; i++) {
			square[i].inValue();
			square[i].outValue();
		}
	}

}
