public class InternetDevice {

    // attributes

    String name;
    boolean connected;
    static int connectedDevices;

    // constructors
    InternetDevice(String name)
    {
        this.name = name;
    }

    // methods

    public void connect()
    {
        if(connected == false){
            connected = true;
        }
    }

    public void disconnect()
    {
        if(connected == true){
            connected = false;
        }
    }

    public void isConnected()
    {
        if(connected == true){
            connectedDevices += 1;
        } 
    }

    public void displayStatus()
    {
        if(connected == true){
            System.out.println(name + " is connected");
            
        } else {
            System.out.println(name + " is disconnected");
        }
    }

    public static void displayConnections()
    {
        System.out.println("Number of connected devices: " + connectedDevices);
    }

    public static void main(String args[]){
        InternetDevice d1 = new InternetDevice("Iphone Maciek");
        InternetDevice d2 = new InternetDevice("Iphone Maciek");
        InternetDevice d3 = new InternetDevice("Iphone Maciek");

        d1.connect();
        d2.connect();
        d3.disconnect();

        d1.isConnected();
        d2.isConnected();
        d3.isConnected();
    }
}
