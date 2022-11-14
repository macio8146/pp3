// import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {
        
        // String name;
        // Scanner in = new Scanner(System.in);

        System.out.println("Enter a name: ");
        //name = in.nextLine();
        //System.out.println("Your name: " + name);

        
        // decimal points

        double x = 2.125152331;
        System.out.printf("%.3f", x);
        System.out.println();

        // converting double into integer 
        double pi = 3.1253623;
        int y = (int) pi;
        System.out.println(y);

        // math 

        double root = Math.sqrt(16);
        System.out.println(root);

        double degrees = 90;
        double angle = degrees / 180 * Math.PI;
        System.out.println(angle);
        System.out.println(Math.E);

        double radians = Math.toRadians(180);
        System.out.println(radians);
        System.out.println(Math.toDegrees(Math.PI));
        System.out.println(Math.round(63.12581921));

        
    }
}
