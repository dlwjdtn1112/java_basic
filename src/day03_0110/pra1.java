package day03_0110;

import java.util.Scanner;

public class pra1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        int i = sc.nextInt();
        int j = sc.nextInt();
        System.out.println(i+j);

        int sum = i+j;

        System.out.println(sum);
        add();
        s1("dlwjdtn1112");

        int regNo = 0;
        regNo = 381112121;
        System.out.println('1'+ 2);
        System.out.println("1"+ 2);
        String adfs = "dfgsd";
        String str = "나는 자바 \\J2SE\\ 입니다 ";
        System.out.println(str);

        String str1 = "서식 문자로 출력하는 방법입니다.\n이것은 문자열 입니다.";
        System.out.println(str1);

        int a = 10;
        int b = 5;
        int result = a+b;
        String str2 = "수식을 출력하면";
        String str3 = "내생일은 03월 29일 입니다.";

        System.out.printf("%s%n%d +%d = %d%n%s",str2,a,b,result,str3);











    }

    static public void add(){
        int x = sc.nextInt();
        int y = sc.nextInt();
        int sum1 = x + y;
        System.out.println(sum1);


    }
    public static void s1(String name){
        System.out.println("나의 이름은 : " + name);
    }

}
