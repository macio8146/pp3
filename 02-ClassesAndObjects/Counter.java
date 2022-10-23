public class Counter{

    //attributes

    int initialValue = 0;
    int value;

    //methods

    public void increaseBy1()
    {
        value += 1;
    }

    public void increaseBy10()
    {
        value += 10;
    }

    public void decreaseBy1()
    {
        value -= 1;
    }

    public void decreaseBy10()
    {
        value -= 10;
    }

    public void reset()
    {
        value = initialValue;
    }

    public void displayValue()
    {
        System.out.println(value);
    }

    public static void main(String args[]){
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();

        counter1.value = 23;
        counter2.value = -47;

        counter1.reset();
        counter1.decreaseBy10();
        counter1.displayValue();
    }
}