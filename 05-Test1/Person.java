public class Person {
    private String name;
    private int age;


    public void setName(String name){
        name = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public boolean isAdult(){
        if(age >= 18){
            return true;
        }
        return false;
    }

    public String toString(){
        return name + ", " + age;
    }

    public static void main(String[] args) {
        Person p1 = new Person("ania", 21);
        System.out.println(p1.getAge());
        System.out.println(p1.isAdult());
        p1.setAge(17);
        System.out.println(p1.isAdult());
        System.out.println(p1.toString());
    }

}
