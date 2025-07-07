package java_fundamental;
import java.util.Scanner;
public class QuestionArrays02 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] arr = new int[5];
	
	    System.out.println("Enter 5 integers:");
	for (int i = 0; i < 5; i++)
	    arr[i] = sc.nextInt();
	
	int max = arr[0], min = arr[0];
	for (int num : arr) {
	    if (num > max) max = num;
	    if (num < min) min = num;
	}
	
	System.out.println("Max: " + max + ", Min: " + min);
	        sc.close();	    
	        }
	}
	
	
