
public class star1 {
	public static void main(String[] args) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<18-i; j++) {
				System.out.print("*");
			}
			for(int k=i*2-1; k>0; k++) {
				System.out.print(" ");
			}
			System.out.println("");
		}
	}
}