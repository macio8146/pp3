import java.util.Scanner;

public class Conjecture {

    public static String reverse(String s){
        String r = "";
        for(int i = s.length() - 1; i > -1; i--){
            r = r + s.charAt(i);
        }
        return r;
    }

    public static String time(int hour, int minute){
        String ampm;
        if (hour < 12) {
            ampm = "AM";
            if (hour == 0) {
                hour = 12;  // midnight
            }
        } else {
        ampm = "PM";
            hour = hour - 12;
        }
        
        return String.format("%02d:%d %s", hour, minute, ampm);
    }

    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {
            for (int y = 1; y <= 10; y++) {
                System.out.printf("%5d", x * y);
            }
            System.out.println();
        }


        String s = "banasa";
        char letter = s.charAt(0);
        System.out.println(letter);


        System.out.print("Greek alphabet: ");
        for (int i = 913; i <= 937; i++) {
        System.out.print(" " + (char) i);
        }
        System.out.println();

        System.out.println(reverse("banana"));


        System.out.print("Play again? ");
        Scanner in = new Scanner(System.in);
        String answer = in.nextLine();

        if (answer.equals("yes")) {                 // wrong!
            System.out.println("Let's go!"); }
        else {
            System.out.println("Goodbye!");
        }

        System.out.println(time(13,55));

        in.close();
    }
}
