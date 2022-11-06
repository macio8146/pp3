public class SurfaceArea{

    public static double areaCircle(int radius){
        double area = 3.14 * (radius*radius);
        return area;
    }

    public static double areaRect(int recX, int recY){
        return recX * recY;
    }

    public static double areaTri(int tribase, int triHeight){
        return 0.5 * tribase * triHeight;
    }


    public static void main(String args[]){
        double areaRectangle = areaRect(4, 5);
        double areaCircle = areaCircle(5);
        double areaTriangle = areaTri(4, 5);

        System.out.println(areaCircle);
        System.out.println(areaRectangle);
        System.out.println(areaTriangle);
    }
}