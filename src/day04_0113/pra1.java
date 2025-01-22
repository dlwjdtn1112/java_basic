package day04_0113;

import java.util.Scanner;

public class pra1 {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 10;
        boolean result = false;
        result = (n1 == n2);
        System.out.println(result);
        result = (n1 != n2);
        System.out.println(result);
        result = (n1 > n2);
        System.out.println(result);
        result = (n1 < n2);
        System.out.println(result);
        result = (n1>=n2);
        System.out.println(result);
        result = (n1 <= n2);
        System.out.println(result);
        int n3 = in.nextInt();
        int n4 = in.nextInt();
        if(n3 == n4){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }

        System.out.println("문자 비교");
        char ch1 = 'A';
        char ch2 = 'B';

        boolean r1 = false;
        r1 = (ch1 < ch2);

        System.out.println(r1);

    }
}
