package day07_0116;

import java.util.Scanner;
//자바에서는 문자열을 처리할 때 자료형 클래스(String, StringBuffer, StringBuilder)
//문자열을 다루는데 있어 공통적으로 사용되자만, 사용 목적에 따라 쓰임새가 다르다.
//기본 자바에서는 String 객체의 값을 변경 할 수 없다.
public class Buffer {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int age = 40;
        String name = "신세계";
        System.out.println(name.hashCode());
        name = "신세계";
        System.out.println(name.hashCode());//주소가 변경된다
        //주소가 변경된다
        System.out.println(name == name);
        System.out.println(name.hashCode());
        String a = "Hello";
        System.out.println(a.hashCode());
        a = "Hello" + " JAVA";
        System.out.println(a.hashCode());
        // 참조변수 a가 참조하는 메모리는 "Hello" 값에 "JAVA" 문자열을 더해서 String객체의 값을 변경한 것
        // 실제 메모리에서는 "Hello JAVA" 따로 만들고 참조 변수 a를 새로운 주소값으로 할당한다.

        //hashCode() : 객체의 메모리 변지를 이용해서 만든 해시코드를 반환한다.

        // 도대체 왜? 불변으로 설계를 했는가?
        // 1. JVM에서는 String Constrant pool문자열을 상수화 시켜서 다른 변수 또는 다른 객체를 공동으로 사용한다.
        // 2. 데이터가 불변하다면, Multi-Thread 환경에서 동기화 문제 발생하지 않기 때문에 안정된 서비스를 제공할 수 있다.
        // 3. 보안(Security)

        // String 주소할당 방식 : 1.리터럴 할당 방식 2. new String()

    }
}
