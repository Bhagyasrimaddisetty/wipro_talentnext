package java_fundamental;
import java.util.Scanner;
public class QuestionArrays01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[5];
    int sum = 0;

    System.out.println("Enter 5 integers:");
for (int i = 0; i < 5; i++) {
    arr[i] = sc.nextInt();
    sum += arr[i];
}

double avg = (double) sum / arr.length;
System.out.println("Sum: " + sum);
System.out.println("Average: " + avg);
sc.close();	   
	        }
	}

