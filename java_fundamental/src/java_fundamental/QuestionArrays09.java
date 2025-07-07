package java_fundamental;
import java.util.Scanner;
import java.util.Arrays;
public class QuestionArrays09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5], result = new int[5];
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        int index = 0;
        for (int num : arr)
            if (num != 10) result[index++] = num;

        System.out.println("Result: " + Arrays.toString(result));
        sc.close();
    }
	}



