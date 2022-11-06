public class Converter {

    // methods

    public static void CelsiusToKlevin(int celsiusTemp)
    {
        double Kelvin = celsiusTemp + 273.15;
        System.out.println(celsiusTemp + " Celsius = " + Kelvin + " Kelvin");
    }

    public static void main(String args[]){
        CelsiusToKlevin(21);
    }
}
