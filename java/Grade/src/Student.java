
public class Student {
	String name;
	int middleScore;
	int finalScore;
	int sum;
	// method 오버로딩
	// 1.
	Student() {
		
	}
	// 2.
	Student(String name) {
		this.name = name;
	}
	// 3.
	Student(String name, int middleScore, int finalScore) {
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
	}
	// random 이용
	@Override
	public String toString() {
		return "" + this.name
				+ " (" + this.middleScore + ", "
				+ this.finalScore + ")";
	}
	public void sum() {
		this.sum = this.middleScore + this.finalScore;
	}
}
