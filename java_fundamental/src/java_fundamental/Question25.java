package java_fundamental;
import java.util.Arrays;
public class Question25 {
 public static void main(String[] args) {
	        int[] arr = {12, 5, 8, 21, 3, 18};
	        Arrays.sort(arr);
	        System.out.println("Smallest two: " + arr[0] + ", " + arr[1]);
	        System.out.println("Largest two: " + arr[arr.length - 1] + ", " + arr[arr.length - 2]);
	    }
	}


