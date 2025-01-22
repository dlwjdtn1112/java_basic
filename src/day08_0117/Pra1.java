package day08_0117;

import java.util.Scanner;

public class Pra1 {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] score = new int[100];

        System.out.println("-------------------------------------------------");
        System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
        System.out.println("-------------------------------------------------");
        //int[] arr = new int[100];

        while(true){
            System.out.print("선택>");
            int a = in.nextInt();
            if(a == 1){
                System.out.println("학생수>");
                int b = in.nextInt();
                score  =  new int[b];
                break;

            }
            else{
                System.out.println("다시 입력");


            }

        }
        System.out.print("선택>");
        int a1 = in.nextInt();
        if(a1 == 2){
            for(int i = 0; i<score.length;i++){
                System.out.print("score["+i+"]>");
                int a2 = in.nextInt();
                score[i] = a2;
            }

        }
        for(int i = 0; i < score.length;i++){
            System.out.println(score[i]);
        }

        while(true){
            System.out.print("선택>");
            int a4 = in.nextInt();
            if(a4 == 3){
                for(int i = 0; i < score.length;i++){
                    System.out.println("score["+i+"]:"+score[i]);
                }
            }
            if(a4 == 4){
                int max = 0;
                int sum = 0;
                for(int num : score){
                    if(num > max){
                        max = num;
                        sum += num;

                    }
                }
                System.out.println("최고점 : "+max);
                System.out.println((double) sum/score.length);
            }
            if(a4 ==5 ){
                System.out.println("프로그램 종료");
                break;
            }
        }

    }
}
