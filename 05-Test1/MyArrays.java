

public class MyArrays {
    
    public static int even(int[] array){
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                counter++;
            }
        }
        return counter;
    }

    public static int positiveOdd(int[] array){
        int counter = 0;

        for(int i = 0; i < array.length; i++){
            if((array[i] > 0) && ((array[i] % 2) != 0)){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        int[] arr = {2, -6, 5, 8};
        System.out.println(even(arr));

        int[] arr1 = {3,2,-5,4,1,-7};
        System.out.println(positiveOdd(arr1));
    }
}
