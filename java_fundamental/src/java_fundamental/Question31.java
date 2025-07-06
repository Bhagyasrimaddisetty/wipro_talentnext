package java_fundamental;
public class Question31 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4};
        boolean valid = true;
        for (int num : arr) {
            if (num != 1 && num != 4) {
                valid = false;
                break;
            }
        }
        System.out.println(valid);
    }
}

