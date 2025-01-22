package day02_0109;

import java.util.Scanner;

public class totalEx01 {
    //멤버변수
    static Scanner in = new Scanner(System.in);

    //사칙연산 기능 메서드 fourArithmetic
    static void fourArithmetic(){

        System.out.println("첫 번째 숫자를 입력하세요:");
        int a = in.nextInt();
        System.out.println("두 번째 숫자를 입력하세요:");
        int b = in.nextInt();
        int result = a + b;
        //System.out.println();
        result = a + b;
        System.out.printf(" a + b = %d\n ",result);
        result = a - b;
        System.out.printf(" a - b = %d\n ",result);
        result = a * b;
        System.out.printf(" a * b = %d\n ",result);
        result = a / b;
        System.out.printf(" a / b = %d\n ",result);
    }


    //operator 기능 메서드
    static void operator(){
        System.out.println("operator함수의 첫 번째 숫자를 입력하세요");
        int kor = in.nextInt();
        System.out.println("operator함수의 두 번째 숫자를 입력하세요");
        int eng = in.nextInt();
        int r1 = 0;
        double avg = 0;

        r1 = kor + eng;
        avg = r1 / 2;
        System.out.printf("국어 영어의 합  %d:" , r1);
        System.out.printf("평균: %.2f", avg);
    }

    //실행 메서드
    public static void main(String[] args) {
        fourArithmetic();
        operator();

    }
}
