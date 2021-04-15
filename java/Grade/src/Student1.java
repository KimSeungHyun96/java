
public class Student1 {
	String name;
	int middleScore;
	int finalScore;
	int totalScore;
	double avgScore;
	
	Student1(String name) {
		this.name = name;
	}

	Student1(String name, int middleScore, int finalScore) {
		this.name = name;
		this.middleScore = middleScore;
		this.finalScore = finalScore;
		this.sum();
	}
	public void sum() {
		this.totalScore = this.middleScore + this.finalScore;
	}
	@Override
	public String toString() {
		this.totalScore = this.middleScore + this.finalScore;
		this.avgScore = (double)(this.middleScore + this.finalScore)/2;
		return "" + this.name + " (중간 : " + this.middleScore + ", 기말 : " + this.finalScore + ", " 
				+ "총합 : " + this.totalScore + ", 평균 : " + this.avgScore + ")";
	}
	
}
