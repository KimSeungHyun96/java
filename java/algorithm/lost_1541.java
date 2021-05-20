package BackJoon;

import java.util.Arrays;
import java.util.Scanner;
// 55-50+40
public class lost_1541 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String[] minusArr = string.split("-"); // "-"을 기준으로 자름 [55, 50+40]
//        System.out.println(Arrays.toString(minusArr));
        int result = 0;
        for (int i = 0; i < minusArr.length; i++) {
            String[] plusArr = minusArr[i].split("\\+"); // "+"를 기준으로 자름 plusArr = [55] [50, 40]
//            System.out.println(Arrays.toString(plusArr));
            for (int j = 0; j < plusArr.length; j++) {
                if (i == 0) { // [55]
                    result += Integer.parseInt(plusArr[j]); // +55
                } else {
                    result -= Integer.parseInt(plusArr[j]); // -50, -40
                }
            }
        }
        System.out.println(result);
    }
}