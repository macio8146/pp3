public class date {
    public static void main(String[] args){
        System.out.println("Hello, World!");
        String day, date, month, year;
       
        day = "Saturday";
        date = "15";
        month = "October";
        year = "2022";

        // American sytem 
        System.out.print("American system: " + day + ", " + month + " " + date + ", " + year);

        // Eurpean system
        System.out.print("European system: ");
        System.out.print(day);
        System.out.print(" ");
        System.out.print(date);
        System.out.print(" ");
        System.out.print(month );
        System.out.print(" ");
        System.out.println(year);
    }
}
