package LaboratoryExercise3;
import java.util.Scanner;
import java.util.Arrays;

public class GreedyCoins {

    public static int minNumCoins(int coins[], int sum) {
        int segashna=0;
        int i=coins.length-1;
        int counter=0;
        Arrays.sort(coins);
        while (segashna!=sum){
            while ((segashna+coins[i])<sum || (segashna+coins[i])==sum){
                segashna+=coins[i];
                counter++;
            }
            i--;
        }
        return counter;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String coinsStringLine = input.nextLine();
        String coinsString[] = coinsStringLine.split(" ");
        int coins[] = new int[coinsString.length];
        for(int i=0;i<coinsString.length;i++) {
            coins[i] = Integer.parseInt(coinsString[i]);
        }

        int sum = input.nextInt();

        System.out.println(minNumCoins(coins, sum));
    }
}