package oops_inheritance;
import java.util.Scanner;
class Shape {
    void draw() {
        System.out.println("Drawing Shape");
    }

    void erase() {
        System.out.println("Erasing Shape");
    }
}

class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Circle");
    }
}

class Triangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Triangle");
    }

    @Override
    void erase() {
        System.out.println("Erasing Triangle");
    }
}

class Square extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing Square");
    }

    @Override
    void erase() {
        System.out.println("Erasing Square");
    }
}
public class QuestionOverriding02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose a shape to draw and erase:");
        System.out.println("1. Circle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        Shape shape;

        switch (choice) {
            case 1:
                shape = new Circle();
                break;
            case 2:
                shape = new Triangle();
                break;
            case 3:
                shape = new Square();
                break;
            default:
                System.out.println("Invalid choice. Defaulting to base Shape.");
                shape = new Shape();
        }

        shape.draw();
        shape.erase();

        sc.close();
    }
}

    