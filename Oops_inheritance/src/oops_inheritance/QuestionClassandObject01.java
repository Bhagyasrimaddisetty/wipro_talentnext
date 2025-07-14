package oops_inheritance;
import java.util.Scanner;
class Box {
    private int length;
    private int width;
    private int height;

    public Box(int l, int w, int h) {
        this.length = l;
        this.width = w;
        this.height = h;
    }

    public int getVolume() {
        return length * width * height;
    }
}

public class QuestionClassandObject01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length: ");
        int l = sc.nextInt();

        System.out.print("Enter width: ");
        int w = sc.nextInt();

        System.out.print("Enter height: ");
        int h = sc.nextInt();

        Box b = new Box(l, w, h);
        System.out.println("Volume of Box: " + b.getVolume());

        sc.close();
    }
}



