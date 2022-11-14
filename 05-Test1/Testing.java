public class Testing {

    public static double distance(double x1, double y1, double x2, double y2){
        double dx = x2 - x1;
        double dy = y2 - y1;
        double dsquared = dx * dx + dy * dy;
        double result = Math.sqrt(dsquared);

        // System.out.println("dx is: " + dx);
        // System.out.println("dy is: " + dy);
        // System.out.println(dsquared);
        // System.out.println(result);

        return result;
    }

    public static void main(String[] args) {
        distance(2, 1, 4, 5);
    }   
}
