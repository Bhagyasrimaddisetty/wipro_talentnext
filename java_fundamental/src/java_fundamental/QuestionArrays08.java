package java_fundamental;
import java.util.Scanner;
public class QuestionArrays08 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[7];
    System.out.println("Enter 7 integers:");
    for (int i = 0; i < 7; i++)
        arr[i] = sc.nextInt();

    int sum = 0;
    boolean skip = false;

    for (int num : arr) {
        if (num == 6) {
            skip = true;
            continue;
        }
        if (num == 7 && skip) {
            skip = false;
            continue;
        }
        if (!skip) sum += num;
    }

    System.out.println("Sum: " + sum);
    sc.close();
}
	}



