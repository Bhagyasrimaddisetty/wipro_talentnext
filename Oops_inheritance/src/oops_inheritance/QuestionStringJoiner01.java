package oops_inheritance;
import java.util.Scanner;
import java.util.StringJoiner;
public class QuestionStringJoiner01 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    StringJoiner sj = new StringJoiner(",","{", "}");

System.out.print("Enter number of names: ");
int n = sc.nextInt();
sc.nextLine(); 

for (int i = 1; i <= n; i++) {
    System.out.print("Enter name " + i + ": ");
    String name = sc.nextLine();
    sj.add(name);
}

System.out.println("Joined names: " + sj.toString());
sc.close();
    }
}


