package java_fundamental;
public class Question22 {
	    public static void main(String[] args) {
	        int[] arr = {45, 23, 89, 12, 67};
	        int max = arr[0], min = arr[0];
	        for (int num : arr) {
	            if (num > max) max = num;
	            if (num < min) min = num;
	        }
	        System.out.println("Maximum: " + max);
	        System.out.println("Minimum: " + min);
	    }
	}


