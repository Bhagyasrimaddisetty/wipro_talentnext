package oops_inheritance;
import java.util.Scanner;
import java.util.StringJoiner;

public class QuestionStringJoiner02 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    StringJoiner s1 = new StringJoiner("-");
StringJoiner s2 = new StringJoiner("-");

System.out.print("Enter number of cities in s1: ");
int n1 = sc.nextInt();
sc.nextLine();

for (int i = 1; i <= n1; i++) {
    System.out.print("Enter city " + i + " for s1: ");
    s1.add(sc.nextLine());
}

System.out.print("Enter number of cities in s2: ");
int n2 = sc.nextInt();
sc.nextLine();

for (int i = 1; i <= n2; i++) {
    System.out.print("Enter city " + i + " for s2: ");
    s2.add(sc.nextLine());
}

StringJoiner s2Merged = new StringJoiner("-");
s2Merged = s2Merged.merge(s2).merge(s1);
System.out.println("s1 merged to s2: " + s2Merged.toString());

StringJoiner s1Merged = new StringJoiner("-");
s1Merged = s1Merged.merge(s1).merge(s2);
System.out.println("s2 merged to s1: " + s1Merged.toString());

        sc.close();
    }
}
