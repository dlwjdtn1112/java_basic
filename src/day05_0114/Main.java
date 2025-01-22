package day05_0114;

import java.util.Scanner;

public class Main {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        int a = in.nextInt();

        int v1 = 1;


        while (true){
            if(a*v1 % 10 == 0){
                System.out.print(a*v1);
                break;
            }
            else if(a*v1 % 10 != 0 && (a*v1) < 100){
                System.out.print(a*v1 +" ");
                v1 += 1;
            }
        }

    }
}
