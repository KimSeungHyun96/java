import java.util.Scanner;

public class ExecClass {
	public static void main(String[] args) {
		// 사용자로부터 입력받은 단어를 reverse 해주세요. ex) apple -> elppa 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요.");
		String input = sc.nextLine();
		
		
//		StringBuffer a = new StringBuffer("apple");
//		a.reverse();
//		System.out.println(a);
		
//		StringBuffer b = new StringBuffer("apple");
//		b.append("1");
//		System.out.println(b);
		
		StringBuffer c = new StringBuffer(input);
		c.reverse();
//		System.out.println(c);
		
		String d = c.toString();
		System.out.println(d);
		String e = new String(c);
		System.out.println(e);
	}
}