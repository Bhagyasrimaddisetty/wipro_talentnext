package java_fundamental;
import java.util.Arrays;
public class Question29 {
    public static void main(String[] args) {
        int[] arr = {1, 10, 10, 2};
        int[] result = new int[arr.length];
        int idx = 0;

        for (int num : arr) {
            if (num != 10) {
                result[idx++] = num;
            }
        }

        System.out.println(Arrays.toString(result));
    }
}


