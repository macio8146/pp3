public class Test_1212 {
    public static void main(String[] args) {
    
        // creating driver d1
        DrivingLicence d1 = new DrivingLicence();

        // printing new line 
        System.out.println();

        // setting values to attributes
        d1.setCity("Kraków");
        d1.setYearOfIssue(1988);
        d1.setDriversName("mAcIek");

        // displaying drivers data 
        System.out.println(d1.toString());

        // printing new line
        System.out.println();
    }
}
