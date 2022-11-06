public class Person {
    //attributes

    String name;
    double weightKg;
    double heightCm;

    // methods

    public void setWeightAndHeight(int weight, int height)
    {
        this.weightKg = weight;
        this.heightCm = height;
    }

    public double calculateBMI()
    {
        double BMI = (weightKg / (heightCm * heightCm)) * 10000;
        return BMI;
    }

    public void displayRecord()
    {
        System.out.println("Name: "+ name);
        System.out.println("Weight: " + weightKg);
        System.out.println("Height: " + heightCm);

        if(calculateBMI() < 18.5){
            System.out.println("BMI too low");
        } else if (calculateBMI() > 24.9){
            System.out.println(calculateBMI() + "BMI too high");
        } else {
            System.out.println("BMI: " + calculateBMI());
        }
    }

    //construcotrs

    Person(String name)
    {
        this.name = name;
    }

    Person(String name, int weight, int height)
    {
        this.name = name;
        weightKg = weight;
        heightCm = height;
    }

    public static void main(String args[]){
        Person p1 = new Person("Maciek", 86, 184);
        Person p2 = new Person("Ania", 60, 163);
        Person p3 = new Person("Piotr", 67, 178);

        p1.displayRecord();
        p2.displayRecord();
        p3.displayRecord();
    }
}
