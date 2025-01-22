package day04_0113;

import java.util.Scanner;

public class Infinity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = 5;
        double y = 0.0;
        double z1 = x / y; // Infinity
        double z = x % y;  // Not a Number

        System.out.println(z + 2);
        System.out.println(z1 + 2);

        //알잠은 코드로 리팩토링 // if의 결과가 false 일경우만 연산 진행함
        if(Double.isInfinite(z) || Double.isNaN(z)){
            System.out.println("값 산출 불가");
        }
        else{

            System.out.println(z+2);
        }

    }
}
