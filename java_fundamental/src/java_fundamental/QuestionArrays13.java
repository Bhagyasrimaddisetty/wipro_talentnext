package java_fundamental;
import java.util.Scanner; 
public class QuestionArrays13 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter 4 integer numbers:");
String[] input = sc.nextLine().split(" ");

if (input.length != 4) {
    System.out.println("O/P: Please enter 4 integer numbers");
    sc.close();
    return;
}

int[][] arr = new int[2][2];

try {
    arr[0][0] = Integer.parseInt(input[0]);
    arr[0][1] = Integer.parseInt(input[1]);
    arr[1][0] = Integer.parseInt(input[2]);
    arr[1][1] = Integer.parseInt(input[3]);
} catch (NumberFormatException e) {
    System.out.println("Please enter valid integer numbers");
    sc.close();
    return;
}

System.out.println("The given array is :");
for (int i = 0; i < 2; i++) {
    for (int j = 0; j < 2; j++) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

System.out.println("The reverse of the array is :");
for (int i = 1; i >= 0; i--) {
    for (int j = 1; j >= 0; j--) {
        System.out.print(arr[i][j] + " ");
    }
    System.out.println();
}

sc.close();

		}
}


