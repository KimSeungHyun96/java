import java.util.Arrays;

public class Student {
	String name;
	int midterm ;
	int finals ;
	int totalScore;
	
	Student(String name, int midterm, int finals) {
		this.name = name;
		this.midterm = midterm;
		this.finals = finals;
		this.sumScore();
		this.printInfo();
	}
	public void printInfo() {
		System.out.println("이름 : " + this.name + ", 중간 : " + this.midterm + " 기말 : " + this.finals + " 총점 : " + (this.midterm+this.finals) + " 평균 : " + (this.midterm+this.finals)/2);
	}
	public void sumScore() {
		this.totalScore = this.midterm + this.finals;
	}
	@Override
	public String toString() {
		return this.name + " : " + this.totalScore;
	}
}