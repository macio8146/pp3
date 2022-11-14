public class Counter_2 {
    int counter;

    Counter_2(){
        this.counter = 0;
    }

    public int increase(){
        counter += 1;
        return counter;
    }

    public int decrease(){
        counter -= 1;
        return counter;
    }

    public int increase(int n){
        counter += n;
        return counter;
    }

    public int decrease(int n){
        counter -= n;
        return counter;
    }

    public int value(){
        return counter;
    }

    public static void main(String[] args) {
        Counter_2 c = new Counter_2();

        c.increase();
        c.increase();
        c.decrease();
        c.increase(5);
        c.decrease(2);
        System.out.println(c.value());
    }
}
