
public class ExecClass {
	public static void main(String[] args) {
//		Student s1 = new Student();
//		s1.name = "홍길동";
//		s1.address = "서울시 마포구";
//		s1.phone = "010-0000-0000";
//		s1.age = 30;
//		
//		Student s2 = new Student();
//		s1.name = "둘리";
//		s1.address = "부산시 동구";
//		s1.phone = "010-0000-0000";
//		s1.age = 100;
		Student s1 = new Student("홍길동", "서울시 마포구", "010-0000-0000", 30);
		Student s2 = new Student("둘리", "부산시 동구", "010-0000-0000", 100);
		// 내부에서 명령을 줌
//		s1.printInfo();
//		s2.printInfo();
		
		// set get이용할 때 출력
//		s1.setName = "고길동";
//		System.out.println(s1.getName);
		
		// 현대기법에서는 이렇게 쓰는게 좋다라고 설명
//		s1.setName = "고길동";
//		System.out.println(s1.name);
		
		// 그냥 s1사용을 하면 메모리 값(주소 값이 리턴됨)이 같이 나옴
		// Student에 toString을 사용하면 출력됨
//		System.out.println(s1);
	}
}