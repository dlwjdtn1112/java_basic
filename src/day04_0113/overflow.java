package day04_0113;

import java.util.Scanner;

public class overflow {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        byte b = 125;
        for(int i = 0; i < 5; i++){
            b++;
            System.out.println("b1 :"+ b);
            System.out.println("i :" + i);
        }

        int apple = 1;
        double pieceUnit = 0.1;
        //사과 1개를 0.1 단위의 10조각으로 보고,그 중 7조각을 학생들에게 나누어 주려고 한다 나누어 주고 남은 양을 출력

        int stuNum = 7;

        double result = apple - stuNum*(pieceUnit);
        System.out.println(result);

        int totalPiece = apple * 10;
        result = totalPiece - stuNum;
        System.out.println("10조각에서 남은 조각 : "+ result);
        System.out.println("사과 1개에서 남은 양은 : " + result / 10.0);


    }
}
