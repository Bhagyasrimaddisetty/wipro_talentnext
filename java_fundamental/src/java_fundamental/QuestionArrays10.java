package java_fundamental;
import java.util.Scanner;
import java.util.ArrayList;
public class QuestionArrays10 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<Integer> even = new ArrayList<>();
    ArrayList<Integer> odd = new ArrayList<>();

    System.out.println("Enter 6 integers:");
    for (int i = 0; i < 6; i++) {
        int num = sc.nextInt();
        if (num % 2 == 0) even.add(num);
        else odd.add(num);
    }

    even.addAll(odd);
    System.out.println("Result: " + even);
    sc.close();
	    }
	}




