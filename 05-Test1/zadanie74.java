import java.util.Arrays;

public class zadanie74 {

    public static int indexOfMax(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i + 1; j < a.length; j++){
                if(a[i] > a[j]){
                    int tmp = a[i];
                    a[i] = a[j];
                    a[j] = tmp;
                }
            }
        }
        return a.length - 1;
    }

    public static void main(String[] args) {
        int[] a = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        indexOfMax(a);
        System.out.println(Arrays.toString(a));
        System.out.println(indexOfMax(a));
    }
}
