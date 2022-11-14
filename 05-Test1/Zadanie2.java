public class Zadanie2 {
    public static double squareRoot(double a){
        double y = a/2;
        double x;

        do{
            x = (y + a/y)/2;
            y = x;
        } while(x - (int)x > 0.0001);

        return x; //stub
    }

    public static void main(String[] args) {
    
        System.out.println(squareRoot(9));
    }
}
