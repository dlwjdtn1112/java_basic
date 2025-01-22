package day09_0120;

import day03_0110.Main;

import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);

        int a = in.nextInt();
        method(a);
        String v1 = method(a);
        int v2 = method2(a);
        System.out.println(v1);
        System.out.println(v2);

        input();
        System.out.println("원의 반지름을 입혁하세요 : ");
        int v3 = in.nextInt();
        calculate(v3);


    }
    public static String method(int num){
        String s1 = " ";
        if(num % 2 ==0){
            s1 = "짝수";
        }

        else{
            s1 = "홀수";
        }
        return  s1;
    }

    public static int method2(int num){
        if(num % 2==0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static void input(){

        System.out.println();
        System.out.println("static 메서드입니다");
        System.out.println(5+6);

    }

    public static void calculate(int num){
        final double PI = 3.14;
        System.out.println("원의 둘레 : "+ 2 * PI * num);
    }
}
