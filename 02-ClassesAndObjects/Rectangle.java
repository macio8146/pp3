public class Rectangle {

    //attributes

    int firstDimension;
    int secondDimension;

    //methods

    public void dimensions()
    {
        System.out.println("Dimensions: " + firstDimension + " x " + secondDimension);
    }

    public void perimeter()
    {
        int perimeter;
        perimeter = 2 * firstDimension + 2 * secondDimension;
        System.out.println("Perimeter: " + perimeter);
    }

    public void area()
    {
        int area;
        area = firstDimension * secondDimension;
        System.out.println("Area: " + area);
    }

    public static void main(String args[]){
        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle();

        rec1.firstDimension = 3;
        rec1.secondDimension = 4;

        rec2.firstDimension = 2;
        rec2.secondDimension = 7;

        // first rec
        System.out.println("First rectangle: ");
        rec1.dimensions();
        rec1.perimeter();
        rec1.area();

        //second rec
        System.out.println("Second rectangle: ");
        rec2.dimensions();
        rec2.perimeter();
        rec2.area();
    }
}
