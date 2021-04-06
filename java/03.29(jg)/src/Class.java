import java.util.Random;
import java.util.Arrays;

public class Class {
	public static void main(String[] args) {
		Random s = new Random();
		int arr[] = new int[20];
		for(int i=0; i<arr.length; i++ ) {
			int num = s.nextInt(20)+1;
			arr[i] = num;
		}
		System.out.println(Arrays.toString(arr));

		for (int i=0; i<arr.length; i++) {
			for (int j =i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {	
					int arr1=arr[i];	
					arr[i]=arr[j]; 
					arr[j]=arr1;
				}
			}
		} 
		System.out.println(Arrays.toString(arr));
		}
	}