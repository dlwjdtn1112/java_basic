package day02_0109;

import java.util.Scanner;

public class pra1 {
    static Scanner sc  = new Scanner(System.in);

    public static void add(){
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result  = 0;
        result = a + b;
        System.out.printf("두수의 합 %d :\n ",result);
    }
    public static int add1(int x,int y){

        return x + y;
    }

    public static void main(String[] args) {
        add();
        int s1 = 0;
        s1 = add1(3,4);
        System.out.printf("두수의 합: %d\n",s1);
        System.out.printf("두수의 합2: %d\n",add1(2,3));


    }
}
