import java.util.Arrays;

public class Alphabet {
    
    public static boolean isAlphabet(String t){
        char[] c = new char[t.length()];

        for(int i = 0; i < t.length(); i++){
            c[i] = t.charAt(i);
        }

        Arrays.sort(c);

        for(int j = 0; j < t.length(); j++){
            if(c[j] != t.charAt(j)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAlphabet("abegsw"));
        System.out.println(isAlphabet("amnia2oaeni"));
    }
}
