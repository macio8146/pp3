
public class lamp {
    
    //attributes
    boolean isOn; // if true then turned on, if not turned off

    //methods
    public void switchOn()
    {
        if (isOn == false){
            isOn = true;
        }
    }

    public void switchOff()
    {
        if (isOn == true){
            isOn = false;
        }
    }

    public void onOrNot()
    {
        if (isOn == true){
            System.out.println("turned on");
        } else {
            System.out.println("turned off");
        }
    }

    public static void main(String args[]){
        lamp lamp1 = new lamp();
        lamp lamp2 = new lamp();

        lamp1.isOn = false;
        lamp2.isOn = true;

        lamp1.switchOn();
        lamp2.switchOff();

        System.out.print("The first lamp is: ");
        lamp1.onOrNot();

        System.out.print("The second lamp is: ");
        lamp2.onOrNot();
    }
    
}
