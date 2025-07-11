package inheritance.newfeatures;
	import java.util.Scanner;

	@FunctionalInterface
	interface Sayable {
	    void say();
	}
	public class QuestionInterfacesnewfeatures02 {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press any key and hit Enter to display message:");
	        sc.nextLine();

	        Sayable s = () -> System.out.println("This is say() method implemented using Lambda Expression.");
	        s.say();
	        sc.close();
	    }
	}


