public class zadanie75 {
    public static boolean areFactors(int n, int[] a){

        for(int i = 0; i < a.length; i++){
            if(n % a[i] != 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] a = {6, 6, 6, 6, 5};
        System.out.println(areFactors(6, a));
    }
}
