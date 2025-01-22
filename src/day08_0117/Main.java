package day08_0117;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int a = in.nextInt();
        int v1 = 0;
        int v2 = 65;
        for(int i = 0 ; i <a;i++){
            for(int j = a-i; j > 0;j--){
                System.out.print((char)v2+" ");
                v2 += 1;
            }
            for(int j = 0;j < i;j++){
                System.out.print(v1 + " ");
                v1+=1;
            }
            System.out.println();
        }


    }
}
