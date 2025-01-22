package day03_0110;

import java.util.Scanner;

public class Calculator {
    static Scanner input  = new Scanner(System.in);
    public static void main(String[] args) {

        //요구사항 : 두개의 정수와 4개의 연산자 해당 연산자를 입력받아서 연산을 출력한다.

        while(true){

            System.out.println("게임에 참가하시겠습니까?");
            String data = input.nextLine();
            if(data.equals("exit")){
                break;
            }
            else if(data.equals("Yes")){
                //System.out.println("i와 j의 값을 입력하시오 : ");
                //int a = input.nextInt();
                //int b = input.nextInt();
                //System.out.println(a+b);
                //System.out.println(a-b);
                //System.out.println(a/b);
                //System.out.println(a*b);
                add();
                minus();


            }


        }
        System.out.println("종료");

    }

    static void add(){
        System.out.println("i 와 j의 값을 입력하시오 : ");
        int i = input.nextInt();
        int j = input.nextInt();
        int sum = 0;
        sum = i+j;
        System.out.println("뎃셈 : " + i+j);
    }

    static void minus(){
        System.out.println("i 와 j의 값을 입력하시오 : ");
        int i = input.nextInt();
        int j = input.nextInt();
        int sum1 = 0;
        sum1 = i - j;
        System.out.println("뺄셈 : " + sum1);
    }
}


