package java_fundamental;
import java.util.Scanner;
public class QuestionArrays12 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] a = new int[3], b = new int[3];

    System.out.println("Enter 3 elements for array A:");
for (int i = 0; i < 3; i++) a[i] = sc.nextInt();

System.out.println("Enter 3 elements for array B:");
for (int i = 0; i < 3; i++) b[i] = sc.nextInt();

int[] result = {a[1], b[1]};
System.out.println("Middle elements: " + result[0] + ", " + result[1]);
sc.close();
}
	}

