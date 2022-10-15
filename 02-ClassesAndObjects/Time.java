public class Time {
    public static void main(String[] args){
        int hour, minute, second, current_hour, current_minute, current_second; 
        hour = 14;
        minute = 35;
        second = 43;
        

        double secondsPast = hour * 60 * 60 + minute * 60 + second;

        System.out.print("Number of seconds since midnight: ");
        System.out.println(hour * 60 * 60 + minute * 60 + second);
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(24 * 60 * 60 - (hour * 60 * 60 + minute * 60 + second));
        System.out.print("Percentage of the day that has passed: ");
        System.out.print(secondsPast/(24 * 60 * 60) * 100);
        System.out.println("%");

        current_hour = 15;
        current_minute = 23;
        current_second = 43;

        double currentTimeInSeconds, differenceInTime;
        currentTimeInSeconds = current_hour * 60 * 60 + current_minute * 60 + current_second;
        differenceInTime = currentTimeInSeconds - secondsPast;


        System.out.print("I spent on this task: ");
        System.out.print((int) differenceInTime/(60 * 60));
        System.out.print("hours");
        System.out.print(", ");
        System.out.print((int)(differenceInTime % (60 * 60))/60);
        System.out.print("minutes");
        System.out.print(" and ");
        System.out.print((int) (differenceInTime % 60 % 60));
        System.out.println(" Seconds");
    }
}
