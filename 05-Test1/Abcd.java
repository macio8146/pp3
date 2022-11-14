import java.util.Arrays;

public class Abcd {
    public static void main(String[] args) {
        
        String a = "Aaciek";
        String m = "Mnia";

        if(a.charAt(0) > m.charAt(0)){
            System.out.println("true");
        }else{
            System.out.println("False");
        }

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        Arrays.sort(cars);
    }
}
