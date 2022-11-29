import java.util.Arrays;

public class Ex14 {
    
    private int scores[];
    private String playerName;

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        if(scores.length != 5){
            System.out.println("Please enter exactly 5 scores!");
        } else {
            this.scores = scores;
        }
    }

    public double mean(){
        int sum = 0;
        double mean;
        Arrays.sort(scores);

        for(int i =1; i < 4; i++){
            sum = sum + scores[i];
        }
        double arrLen = scores.length - 2;
        mean = sum / arrLen;
        
        return mean;
    }

    public static void main(String[] args) {
        Ex14 p1 = new Ex14();
        Ex14 p2 = new Ex14();
        Ex14 p3 = new Ex14();

        int[] arr = {1,2,3,4,5};
        p1.setScores(arr);

        int[] arr2 = {2,5,2,2,4};
        p2.setScores(arr2);

        int[] arr3 = {1,5,5,5,5};
        p3.setScores(arr3);

        
        System.out.println("Final result: " + p1.mean());
        System.out.println("Final result: " + p2.mean());
        System.out.println("Final result: " + p3.mean());
    }
}
