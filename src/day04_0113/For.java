package day04_0113;

import java.util.Scanner;

public class For {
    public static class Pra {
        static Scanner in = new Scanner(System.in);
        public static void main(String[] args) {
            //byte b = 100;
            //System.out.println(-b);
            //System.out.println(-(-b));

            //2.증감 연산자(++,--)변수의 값을 1 증가시킴 또는 1 감소
            // 변수 단독으로 증감,감소 연산자를 사용한 경우 결과는 동일

            int x = 1;
            int y = 1;
            //int result1 = ++x;
            //System.out.println(x + " "  + result1);
            //int result2 = x++;
            //System.out.println(x + " " + result2);
            //System.out.println(result1 + " " + result2+" " + x);

            int result1 = ++x + 10;
            int result2 = y++ + 10;
            System.out.printf("%d ",result1);
            System.out.printf("%d",result2);



        }

        static void add(){
            System.out.println("두개의 숫자를 입력하세요 : ");
            int a = in.nextInt();
            int b = in.nextInt();
            int sum = 0;
            sum = a + b;
            System.out.println(sum);


        }

        static int add1(int a, int b){
            return a+b;

        }
    }
}
