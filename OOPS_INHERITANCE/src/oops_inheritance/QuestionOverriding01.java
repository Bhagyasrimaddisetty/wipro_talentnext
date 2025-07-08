package oops_inheritance;
import java.util.Scanner;
class Fruit {
String name;
String taste;
int size;

public Fruit(String name, String taste, int size) {
    this.name = name;
    this.taste = taste;
    this.size = size;
}

void eat() {
    System.out.println("Fruit: " + name + ", Taste: " + taste);
    }
}

class Apple extends Fruit {
    public Apple(int size) {
        super("Apple", "Sweet", size);
}

@Override
void eat() {
    System.out.println("Apple tastes sweet and crunchy.2"
+ "");
    }
}

class Orange extends Fruit {
    public Orange(int size) {
        super("Orange", "Sour", size);
}

@Override
void eat() {
    System.out.println("Orange tastes tangy and juicy.");
    }
}

public class QuestionOverriding01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Apple");
System.out.println("2. Orange");
System.out.print("Enter your choice: ");
int choice = sc.nextInt();

System.out.print("Enter fruit size (as integer): ");
int size = sc.nextInt();

if (choice == 1) {
    Fruit apple = new Apple(size);
    apple.eat();
} else if (choice == 2) {
    Fruit orange = new Orange(size);
    orange.eat();
} else {
    System.out.println("Invalid choice.");
        }

        sc.close();
    }
}


    