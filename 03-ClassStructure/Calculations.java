public class Calculations {
    
    public static double numberOfItems(double x, double y)
    {
        double numOfItems = y - x + 1;
        return numOfItems;
    }

    public static double sumOfItems(double x, double y)
    {
        double sum = 0;
        for(double i = x; i <= y; i++){
            sum += i;
        }
        return sum;
    }

    public static double meanOfItems(double x, double y)
    {
        double mean = sumOfItems(x, y) / numberOfItems(x, y);

        return mean;
    }

    public static void main(String args[]){
        double a = 5;
        double b = 10;

        System.out.println(numberOfItems(a, b));
        System.out.println(sumOfItems(a, b));
        System.out.println(meanOfItems(a, b));
    }
}
