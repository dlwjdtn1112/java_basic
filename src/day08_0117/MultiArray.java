package day08_0117;

import java.util.Scanner;

public class MultiArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] scores = {
                {83,90,96},
                {76,88}
        };

        System.out.println(scores.length);
        System.out.println(scores[0][0]);
        System.out.println(scores[1][1]);
        System.out.println("--------");

        for(int i = 0; i < scores.length;i++){
            for(int j = 0; j < scores[i].length;j++){
                System.out.print(scores[i][j]+" ");
            }
            System.out.println();
        }
        int sum = 0;
        int cnt = 0;


        for(int i = 1; i < scores.length;i++){
            for(int j = 0; j < scores[i].length;j++){
                sum += scores[i][j];
            }
            cnt += scores[i].length;
            //System.out.println();
        }
        System.out.println(cnt);
        System.out.printf("%.3f",(double)sum/cnt);

        int a = scores[1].length;

        int[] arr = new int[a];

        System.out.println("--");
        System.out.println(a);
        for(int i = 0; i < arr.length;i++){
            arr[i] = scores[1][i];
        }
        int sum1 = 0;
        for(int num : arr){
            //System.out.println(num);
            sum1 += num;
        }
        System.out.printf("%.1f",(double)sum1/a);
    }
}
