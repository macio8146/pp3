public class Product {
    
    // Attributes

    private String name;
    private boolean isVegeterian;

    // Getters and setters

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setIsVegeterian(boolean isVegeterian){
        this.isVegeterian = isVegeterian;
    }

    public boolean getIsVegeterian(){
        return isVegeterian;
    }

    // methods

    public void displayData(){
        System.out.println("Product name: " + getName());
        System.out.println("Is vegeterian: " + getIsVegeterian());
    }

    public static void main(String[] args) {

        // Creating an apple object
        Product apple = new Product();

        apple.setName("Apple");
        apple.setIsVegeterian(true);

        // new line
        System.out.println();

        // displaying data
        apple.displayData();

        // new line 
        System.out.println();
    }
}
