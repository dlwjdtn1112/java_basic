package day06_0115;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int a = in.nextInt();
        //int b = in.nextInt();

        for(int i = 1; i < a + 1;i++){
            for(int j = 1 ;j <a+1;j++){
                System.out.print("("+i+", "+j+")" +" ");
            }
            System.out.println();
        }
    }

}
