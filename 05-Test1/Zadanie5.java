public class Zadanie5 {
    public static boolean isDoubloon(String s){
        
        String l = s.toLowerCase();
        int counter = 1;

        for(int i = 0; i < l.length(); i++){
            for(int j = l.length() - 1; j > i; j--){
                if(l.charAt(i) == l.charAt(j)){
                    counter++;
                    if(counter > 1){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
       System.out.println(isDoubloon("Maaciek"));
    }
}
