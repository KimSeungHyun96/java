import java.util.Arrays;
// 10명의 데이터(이름, 중간고사 점수, 기말고사 점수)
// 전체 평균과 총점구하기
// 성적이 높은 순서대로
public class ExecClass {
	public static void main(String[] args) {


	Student student[]= {new Student("김승현", 90, 78),
	new Student("김승현", 80, 58),
	new Student("김승현", 50, 63),
	new Student("김승현", 24, 36),
	new Student("김승현", 44, 10),
	new Student("김승현", 12, 36),
	new Student("김승현", 10, 12),
	new Student("김승현", 42, 18),
	new Student("김승현", 86, 24),
	new Student("김승현", 85, 75)};
	
	int totalmidterm = 0;
	int totalfinals = 0;
	int TotalScore = 0;
	
	for(int i = 0; i < student.length; i++) {
		totalmidterm = totalmidterm + student[i].midterm;
		totalfinals = totalfinals + student[i].finals;
		TotalScore = TotalScore + student[i].totalScore;
	}
	double avgmidterm = (double)totalmidterm / student.length;
	double avgfinals = (double)totalfinals / student.length;
	double avgTotalScore = (double)TotalScore / student.length;
				
	
	System.out.println("중간 총점 : " + totalmidterm + ", 중간 평균 : " + avgmidterm);
	System.out.println("기말 총점 : " + totalfinals + ", 기말 평균 : " + avgfinals);
	System.out.println("전체 총점 : " + TotalScore + ", 전체 평균 : " + avgTotalScore);
	
	for (int i = 0; i < student.length - 1; i++) {
		for (int j = i + 1; j < student.length; j++) {
			if (student[i].totalScore < student[j].totalScore) {
				Student temp = student[i];
				student[i] = student[j];
				student[j] = temp;
			}
		}
	}
	System.out.println("" + "순위 : " + (Arrays.toString(student)));
		}
	}
