
public class Student {
	// extends Object가 생략이 되어있음 Object클래스에서 상속이 되어있음
//public class Student extends Object {
		// 같은 패키지 내에서만 접근 가능(같은 폴더안에서 묶인 클래스만 가능)
		// 내부 변수를 모두 private로 바꾸면 s1.name 등 접근 불가능
		// method를 통해서 접근가능
//		private string name;
		String name;
		String address;
		String phone;
		int age; // 프로퍼티 > Student아래의 인자값으로 들어감
		
		Student(String name, String address, String phone, int age) {
			// 내부접근 시 this를 붙임 this.name > String name의 프로퍼티에 접근함
			this.name = name;
			this.address = address;
			this.phone = phone;
			this.age = age;
			this.printInfo(); // 내부에서 접근 가능
		}
		
		// 출력 메소드
		public void printInfo() {
			System.out.println("이름 : " + this.name + ", 주소 : " + this.address + ", 연락처 : " + this.phone + ", 나이 : " +this.age);
		// 같은 패키지 내에서만 접근 가능(같은 폴더안에서 묶인 클래스만 가능)
//		protected void printInfo() {
//			System.out.println("이름 : " + this.name + ", 주소 : " + this.address + ", 연락처 : " + this.phone + ", 나이 : " +this.age);
		}
		
		// set get사용 (클래스 코드가 길어지기 때문에 단점)
//		public void setName(String name) {
//			this.name = name;
//		}
//		public setName getName) {
//			return this.name;
		
		// toString을 사용하면 바로 출력되게 함 
//		public String toString() {
//			return "이름 : " + this.name + ", 주소 : " + this.address + ", 연락처 : " + this.phone + ", 나이 : " +this.age;
//		}

	}