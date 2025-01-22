package day08_0117;
//변수는 하나의 값만 저장.
//학생 30명의 성적을 저장하고 평균을 구해야 하는 프로그램
//배열은 연속된 공간에 값을 나열한다.->인덱스가 존재한다.

import java.util.Scanner;

public class Subject1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] score = new int[4];
        int sum = 0;
        double avg = 0.0;


        for(int i = 0; i < score.length;i++){
            System.out.println("평균을 입력하세요 : ");
            int a = in.nextInt();
            score[i] = a;
        }

        for(int i = 0; i <score.length;i++){
            sum += score[i];
        }
        avg = (double)sum/score.length;
        System.out.printf("학생 평균 : %.1f",avg);

        





    }
}
