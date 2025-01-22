package day06_0115;
// continue 문은 반복문 for,while,do-while문 안에서만 사용되는 명령어

import java.util.Scanner;
// 1에서 10사이의 수 중에서 짝수만 출려갛고 홀수인 경우에는
public class Continue {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        //int a = (int)(Math.random()*10)+1;

        for(int i = 0; i < 10; i++){
            int a = (int)(Math.random() * 10) + 1;
            if(a % 2 == 0){
                System.out.print(a + " ");
            }
            else{
                continue;
            }


        }
    }
}
