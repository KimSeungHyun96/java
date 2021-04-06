import java.util.Arrays;

public class selection {
	  static int swapCnt;
	  public static void main(String[] args) {
	    	int array[] = {7,74,8,100,0,3,5,1,2,6,9};
	    	
	    	sort(array);
	    	
	    	System.out.println(Arrays.toString(array));
	    }
	  
	public static void sort(int[] arr) {
      for (int i = 0; i < arr.length - 1; i++) {
          int minIdx = i;
          for (int j = i + 1; j < arr.length; j++) {
              if (arr[j] < arr[minIdx])
                  minIdx = j;
          }
          swap(arr, i, minIdx);
          swapCnt++;
//          System.out.println("minIdx 결과 : "+minIdx);
          System.out.println((i+1)+"회전 결과 : "+Arrays.toString(arr));
         

      }
      System.out.println("swap cnt : "+swapCnt );
  }

  private static void swap(int[] arr, int a, int b) {
      int tmp = arr[a];
      arr[a] = arr[b];
      arr[b] = tmp;
  }
}