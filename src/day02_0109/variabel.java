package day02_0109;

import java.util.Scanner;

public class variabel {
    public static void main(String[] args) {
        System.out.println("Hello Java");
        System.out.println("당신의 이름을 입력하세요");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println("당신의 이름은 : " + name);
        callName();
        String v1 = callStringName();
        System.out.println(v1);
        String eat = callStringName();
        eat = eat + "맛있다.남남";
        callStringParam(eat);




    }

    public static void callName(){
        System.out.println("내 이름은 말해");
    }

    public static String callStringName(){
        String name = "라면";

        return name;

    }

    public static void callStringParam(String eat){
        System.out.println(eat+"ddd");
    }

}
