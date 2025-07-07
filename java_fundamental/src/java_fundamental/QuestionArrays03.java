package java_fundamental;
import java.util.Scanner;
public class QuestionArrays03 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] arr = {1, 4, 34, 56, 7};

	        System.out.print("Enter number to search: ");
	        int target = sc.nextInt();

	        int index = -1;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == target) {
	                index = i;
	                break;
	            }
	        }

	        System.out.println("Index: " + index);
	        sc.close();
	    }
	}



