package day06_0115;

import java.util.Scanner;

public class Do_while {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("메세지를 입력하세요");
        System.out.println("프로그램을 종료하려면 \"exit\"를 입력하세요");

        String inputString;
        do{
            System.out.print("> ");
            inputString = in.nextLine();
            System.out.println(inputString);

        }while(!inputString.equals("exit")

        );

        System.out.println();
        System.out.println("프로그램 종료");
        //주사위 문제
        while(true){
            int num = (int) (Math.random() * 6) + 1;
            System.out.println("계속 게임을 원하시면 s,종료를 원하시면 프로그램 종료 입력");
            String v1 = in.nextLine();
            if(v1.equals("프로그램 종료")){
                System.out.println(num);
                System.out.println("프로그램 종료");
                break;
            }
            else if(v1.equals("s")){
                System.out.println(num);
            }
            else{
                System.out.println("올바른 형식이 아님. 다시 입력!");
                System.out.println("-------------------------");
            }
        }
    }
}
