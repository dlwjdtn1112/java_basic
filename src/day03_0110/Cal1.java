package day03_0110;

import java.util.Scanner;

public class Cal1 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("a의 값을 입력하세요 : ");
        int a = input.nextInt();
        System.out.println("b의 값을 입력하세요 : ");
        int b = input.nextInt();
        add(a,b);
        minus(a,b);
        div(a,b);
        multiply(a,b);






    }
    static void add(int a,int b){
        int sum = 0;
        sum = a + b;
        System.out.println("두수의 합 : " + sum);
    }

    static void minus(int a,int b){
        int min = 0;
        min = a - b;
        System.out.println("두수의 뺄셈 : " + min);
    }

    static void multiply(int a,int b){
        int mult = 0;
        mult = a * b;
        System.out.println("두수의 곱 : " + mult);
    }

    static void div(int a,int b){
        int div = 0;
        div = a / b;
        System.out.println("두수의 나눈 값 : " + div);
    }
}
