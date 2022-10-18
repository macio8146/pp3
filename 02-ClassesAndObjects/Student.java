public class Student {

    // atributes
    String name;
    int age;
    String student_id_card;
    boolean isValid;
    int semester_num;
    double average_grade;


    // methods 
    public void sayHello()
    {
        System.out.println("Hello");
    };

    public void displayName()
    {
        System.out.println("Moje imię to: " + name);
    };

    public int displayAge()
    {
        System.out.print("Mój wiek to: ");
        System.out.println(age);

        return 0;
    };

    public void data()
    {   
        System.out.println("Moje imię to: " + name);
        System.out.print("Semester number: " + semester_num);
        System.out.print("Average grade: " + average_grade);
    };

    public void changeStatus()
    {
        isValid = !isValid;
    }

    public void data2()
    { 
        System.out.println("Moje imię to: " + name);
        System.out.println("Student's ID: " + student_id_card);
        System.out.println(isValid);


    }

    // main
    public static void main(String[] args){
        Student s1 = new Student();

        s1.name = "Maciek";
        s1.age = 20;
        s1.student_id_card = "229859";
        s1.isValid = true;
        s1.semester_num = 3;
        s1.average_grade = 4.9;

        s1.data();
        s1.changeStatus();
        s1.data2();
    }
}



