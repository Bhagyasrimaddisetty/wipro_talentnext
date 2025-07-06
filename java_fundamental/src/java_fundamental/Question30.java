package java_fundamental;
import java.util.*;
public class Question30 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int num : arr) {
            if (num % 2 == 0) even.add(num);
            else odd.add(num);
        }

        even.addAll(odd);
        System.out.println(even);
    }
}


