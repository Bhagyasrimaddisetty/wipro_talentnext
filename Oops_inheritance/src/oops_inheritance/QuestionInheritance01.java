package oops_inheritance;
import java.util.Scanner;
		class Animal {
	    void eat() {
	        System.out.println("Animal eats");
}

void sleep() {
    System.out.println("Animal sleeps");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird eats seeds");
}

@Override
void sleep() {
    System.out.println("Bird sleeps in nest");
}

void fly() {
    System.out.println("Bird flies in sky");
    }
}

public class QuestionInheritance01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose an object to create:");
System.out.println("1. Animal");
System.out.println("2. Bird");
System.out.print("Enter your choice (1 or 2): ");

int choice = 0;
try {
    choice = sc.nextInt();
} catch (Exception e) {
    System.out.println("Invalid input. Please enter a number.");
    sc.close();
    return;
}

System.out.println();

if (choice == 1) {
    Animal animal = new Animal();
    animal.eat();
    animal.sleep();
} else if (choice == 2) {
    Bird bird = new Bird();
    bird.eat();
    bird.sleep();
    bird.fly();
} else {
    System.out.println("Invalid choice. Please select 1 or 2.");
        }

        sc.close();
    }
}


