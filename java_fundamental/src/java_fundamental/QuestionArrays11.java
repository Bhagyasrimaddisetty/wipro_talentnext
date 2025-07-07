package java_fundamental;
import java.util.Scanner;
public class QuestionArrays11 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[4];

    System.out.println("Enter 4 integers:");
    for (int i = 0; i < 4; i++)
        arr[i] = sc.nextInt();

    boolean valid = true;
    for (int num : arr)
        if (num != 1 && num != 4) valid = false;

    System.out.println("Result: " + valid);
    sc.close();
	    }
	}


