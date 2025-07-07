package java_fundamental;
import java.util.Scanner;
import java.util.Arrays;
public class QuestionArrays05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[6];

        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 6; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        System.out.println("Two smallest: " + arr[0] + ", " + arr[1]);
        System.out.println("Two largest: " + arr[4] + ", " + arr[5]);
        sc.close();
	    }
	}


