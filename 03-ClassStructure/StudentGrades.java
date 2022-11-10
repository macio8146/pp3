import java.util.Scanner;
import java.util.Arrays;

public class StudentGrades {

    // attributes

    String studentName;
    double[] grades;

    // contructors

    StudentGrades(String name, double[] grades) {
        this.studentName = name;
        this.grades = grades;
    }

    StudentGrades(String name, int numberOfGrades){
        this.studentName = name;

        double[] tempArray = new double[numberOfGrades];
        this.grades = tempArray;

        double[] gradesArray = {2.0, 3.0, 3.5, 4.5, 5.0};
        for(int i=0; i<(numberOfGrades); i++){
           int nr = (int)(Math.random() * 5);
            this.grades[i] = gradesArray[nr];
        }

    }

    StudentGrades(String name) {
        this.studentName = name;

        Scanner myobj = new Scanner(System.in);

        int numberOfGrades = myobj.nextInt();

        for(int i = 0; i < numberOfGrades; i++){
            System.out.println("Enter a single grade: ");
            
            double grade = myobj.nextDouble();
            this.grades[i] = grade;
        }
        myobj.close();
    }


    // methods

    public double lowestGrade()
    {
        double[] temp = grades;
        Arrays.sort(temp);

        return temp[0];
    }

    public double highestGrade()
    {
        double[] temp = grades;
        Arrays.sort(temp);
        
        return temp[temp.length - 1];
    }

    public int numberOfGrades(){
        int numberOfGrades = grades.length;

        return numberOfGrades;
    }

    public double GPA(){
        double sumOfGrades = 0;

        for(int i = 0; i < grades.length; i++){
            sumOfGrades += grades[i];
        }

        double gpa = sumOfGrades / numberOfGrades();

        return gpa;
    }

    public void studentRecord(){
        System.out.println();
        System.out.println("Student's name: " + studentName);
        System.out.println("Student's grades: " + Arrays.toString(grades));
        System.out.println("Number of grades: "+numberOfGrades());
        System.out.println("Lowest grade: " + lowestGrade());
        System.out.println("Highest grade: "+highestGrade());
        System.out.println("Grade point average: "+ GPA());

    }

    public static void main(String[] args){
        double[] amandaGrades = {3.5, 4.5, 4.0, 2.0, 5.0, 3.5, 3.5};
        StudentGrades amanda = new StudentGrades("Amanda", amandaGrades);
        amanda.studentRecord();

        double[] jamesGrades = {2.0, 3.0, 2.0, 4.5, 4.5};
        StudentGrades james = new StudentGrades("James", jamesGrades);
        james.studentRecord();

        double[] aniasGrades = {5.0, 5.0, 5.0};
        StudentGrades ania = new StudentGrades("Ania Stós", aniasGrades);
        ania.studentRecord();

        StudentGrades aaa = new StudentGrades("aaa", 3);
        aaa.studentRecord();
    }  
}
