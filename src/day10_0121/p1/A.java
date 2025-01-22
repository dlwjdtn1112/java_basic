package day10_0121.p1;

public class A {
    //필드 선언
    A a1 = new A(true);
    A a2  = new A(1);
    A a3 = new A("문자열");
    //기본 생성자
    public A(){}
    // public 접근 제한 생성자 선언
    public A(boolean b){
//        this.a1 = a1;
//        this.a2 = a2;
//        this.a3 = a3;


    }
    //default 접근 제한 생성자 선언
    A(int i){}
    //private 접근 제한 생성자 선언
    private A(String s){}

}
