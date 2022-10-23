public class smartphone {

    //atributes
    String model;
    String size;
    int memory;
    double price;
    String color;

    //methods
    public void data()
    {
        System.out.println("Model: " + model + " Size: " + size + " Memory: " + memory + " GB ");
    }

    public void displayPrice()
    {
        System.out.println("Price: " + price);
    }

    public void displayColor()
    {
        System.out.println("Color: " + color);
    }
    public static void main(String args[]){
        smartphone iPhone = new smartphone();

        iPhone.model = "iPhone 13 Pro";
        iPhone.size = "Regular";
        iPhone.memory = 256;
        iPhone.price = 5199.0;
        iPhone.color = "White";

        iPhone.data();
        iPhone.displayPrice();
        iPhone.displayColor();
    }
}