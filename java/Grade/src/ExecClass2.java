import java.util.Arrays;
import java.util.Random;

public class ExecClass2 {
	public static void main(String[] args) {
		Random random = new Random();
		Student[] class2 = {
				new Student("홍길동"),
				new Student("둘리"),
				new Student("또치"),
				new Student("도우너"),
				new Student("강감찬"),
				new Student("이순신"),
				new Student("이성계"),
				new Student("박찬호"),
				new Student("박세리"),
				new Student("김연아")};	
		
		for (int i = 0; i < class2.length; i++) {
			class2[i].middleScore = random.nextInt(101);
			class2[i].finalScore = random.nextInt(101);
		}

		int totalmiddleScore = 0;
		int totalfinalScore = 0;
		int Total = 0;

		for(int i = 0; i < class2.length; i++) {
			totalmiddleScore = totalmiddleScore + class2[i].middleScore;
			totalfinalScore = totalfinalScore + class2[i].finalScore;
			Total = totalmiddleScore + totalfinalScore;
		}
		double avgmiddleScore = (double)totalmiddleScore / class2.length;
		double avgfinalScore = (double)totalfinalScore / class2.length;
		double avgTotalScore = (double)Total / 2;

		System.out.println("중간 총합 : " + totalmiddleScore + " 중간 평균 : " + avgmiddleScore);
		System.out.println("기말 총점 : " + totalfinalScore + " 기말 평균 : " + avgfinalScore);
		System.out.println("전체 총점 : " + Total + " 전체 평균 : " + avgTotalScore);

		for (int i = 0; i < class2.length; i++) {
			for (int j = i + 1; j < class2.length; j++) {
				if (class2[i].totalScore < class2[j].totalScore) {
					Student temp = class2[i];
					class2[i] = class2[j];
					class2[j] = temp;
				}
			}
		}
		System.out.println("" + "등수 : " + (Arrays.toString(class2)));
	}
}
