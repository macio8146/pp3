import java.util.Arrays;
import java.util.Random;

public class Arr {

    public static int[] randomArray(int size){
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
        }

    public static void main(String[] args) {
        int[] counts = {1, 2, 3, 4};
        int[] b = counts;

        System.out.println(Arrays.toString(b));

        int[] arr = randomArray(10);
        System.out.println(Arrays.toString(arr));
    }
}
