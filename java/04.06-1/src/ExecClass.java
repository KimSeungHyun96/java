import java.util.Arrays;

public class ExecClass {
	public static void main(String[] args) {
		
		Student[] s = { new Student("홍길동", "서울시 마포구", "010-0000-0000", 30)
				, new Student("둘리", "부산시 동구", "010-0000-0000", 100)};
		System.out.println(Arrays.toString(s));
	}
}