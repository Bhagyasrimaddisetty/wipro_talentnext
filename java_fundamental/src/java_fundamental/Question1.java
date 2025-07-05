package java_fundamental;
import java.util.Scanner;
public class Question1 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter company name: ");
	        String company = sc.next();
	        System.out.println("Enter location: ");
	        String location = sc.next();
	        System.out.println(company + " Technologies " + location);
	        sc.close();
	    }
	}
