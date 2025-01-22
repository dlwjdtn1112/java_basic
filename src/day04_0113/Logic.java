package day04_0113;

public class Logic {
    public static void main(String[] args) {
        //논리 연산자(&& 논리곱 , || 논리합, ! 부정, ^배타적 논리합)

        int charCode = 'A'; //65 ~90 대문자 영역

        //charCode 변수에 둘어간 값이 대문자인지 소문자인지를 검증하고 싶다.
        if((65 <= charCode) && (charCode <= 90)){
            System.out.println("대문자 ");

        }
        charCode = 48;

        if((48 <= charCode) && (charCode <=57)){
            System.out.println("0~9 사이의 숫자값");
        }

        int value = 31;
        // value 변수의 값이 짝수인지 홀수 인지 판별하는 구문을 작성
        if(value % 2 ==0){
            System.out.println("짝수");
        }
        else{
            System.out.println("홀수");
        }

        //value 변수의 값이 2의 배수이거나 3의 배수인지를 확인하는 구문을 작성
        if((value % 3 == 0) || (value % 2 == 0)){
            System.out.println("2 또는 3의 배수 ");
        }
        else{
            System.out.println("2의 배수,3의 배수 둘다 아님");
        }

    }
}
