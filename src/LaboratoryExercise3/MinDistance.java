package LaboratoryExercise3;

import java.util.Scanner;

public class MinDistance {

    public static float minimalDistance(float points[][]) {
        float minimum=(float)Math.sqrt(Math.pow(Math.abs(points[0][0]-points[1][0]),2) + Math.pow(Math.abs(points[0][1]-points[1][1]), 2)),segashna;;
        for(int i=0;i<points.length;i++){
            for(int j=i+1;j< points.length;j++){
                segashna = (float) Math.sqrt(Math.pow(Math.abs(points[i][0]-points[j][0]),2) + Math.pow(Math.abs(points[i][1]-points[j][1]), 2));
                if(segashna < minimum){
                    minimum = segashna;
                }
            }
        }
        return minimum;
    }

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        float points[][] = new float[N][2];

        for(int i=0;i<N;i++) {
            points[i][0] = input.nextFloat();
            points[i][1] = input.nextFloat();
        }

        System.out.printf("%.2f\n", minimalDistance(points));
    }
}