import java.util.Arrays;

public class zad123 {
    public static void main(String[] args) {
        
        for(char c = 'A'; c <= 'Z';c++){
            System.out.print(c);
        }
        
        System.out.println();

        String fruit = "banana";
        char letter = 'a';
        int counter = 0;

        for(int i = 0; i < fruit.length();i++){
            if(fruit.charAt(i) == letter){
                counter++;
            }
        }

        System.out.println(counter);

        String s = "Maciek";
        char[] a = s.toCharArray();
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i]);
        }

        String abc = "banana";
        int index = abc.indexOf('a', 2);
        System.out.println(index);

        String abcd = "yessss";
        if(abcd.equals("yes")){
            System.out.println("True");
        } else {
            System.out.println("false");
        }


        int[] arka = {1, 2, 3};
        int[] barka = Arrays.copyOf(arka, arka.length);  
    }
}
