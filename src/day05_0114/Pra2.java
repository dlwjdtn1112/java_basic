package day05_0114;

import java.util.Scanner;

public class Pra2 {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;

        while(true){
            int a = in.nextInt();
            if(a == 0){
                break;
            }
            else{
                if(a % 2 ==0){
                    even += 1;
                }
                else{
                    odd += 1;
                }
            }
        }
        System.out.println("odd : " + odd);
        System.out.println("even : " + even);
    }
}
