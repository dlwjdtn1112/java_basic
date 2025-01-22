package day07_0116;
//자바의 문자열은 String 객체가 생성된다.
// String name;
// String hobby;
// name = "신세계"; 문자열리터링 표현으로 갑ㅇ르 할당이 가능하다. 문자열은 String 객체가 생성되고, 객체의 번지가 할당

import java.util.Scanner;

public class StringEx {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name1 = "신세계";//상수풀(set의 특징을 가지고 있다.)에 저장
        String name2 = "신세경";//

        String name3 = new String("신세계");// 인스턴스 먼저 검사를 해서 중복 여부 확인
        String name4 = new String("신세경");

        String name5 = new String("하하하");
        String name6 = new String("하하하");
        String name7 = "하하하";



//        System.out.println("name1 : "+name1.hashCode());
//        System.out.println("name2 : "+name2.hashCode());
//        System.out.println("name3 : "+name3.hashCode());
//        System.out.println("name4 : "+name4.hashCode());
//        System.out.println("name5 : "+name5.hashCode());
//        System.out.println("name6 : "+name6.hashCode());
//        System.out.println(name6.equals(name5));//문자열 자체 비교
//        System.out.println(name6 == name5);
        //2개의 공간


//        System.out.println(name5 ==  name6);
//        System.out.println(name6 ==  name7);
//        System.out.println(name5 ==  name7);

        System.out.println(name5.hashCode());
        System.out.println(name6.hashCode());
        System.out.println(name7.hashCode());


    }
}
