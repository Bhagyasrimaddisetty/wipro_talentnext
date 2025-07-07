package java_fundamental;
import java.util.Scanner;
import java.util.LinkedHashSet;
public class QuestionArrays07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        System.out.println("Enter 6 integers:");
        for (int i = 0; i < 6; i++)
            set.add(sc.nextInt());

        System.out.println("Array after removing duplicates: " + set);
        sc.close();
    }
	}



