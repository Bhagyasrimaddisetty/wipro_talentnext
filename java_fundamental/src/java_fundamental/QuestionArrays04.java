package java_fundamental;
import java.util.Scanner;
public class QuestionArrays04 {
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] ascii = new int[5];
	
	    System.out.println("Enter 5 ASCII values:");
	for (int i = 0; i < 5; i++)
	    ascii[i] = sc.nextInt();
	
	System.out.print("Characters: ");
	for (int value : ascii)
	    System.out.print((char) value + " ");
	    sc.close();
	}
	}


