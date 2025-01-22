package day04_0113;

public class Pra2 {
    public static void main(String[] args) {
        int n5= 1;
        double n6 = 1.0;

        boolean r1 = false;
        r1 = (n5 == n6);
        System.out.println(r1);

        float n7  = 0.1f;
        n6 = 0.1;

        r1 = (n7==n6);//0.1f == 0.1
        System.out.println(r1);
        r1 = ((float)n7 == n6);
        System.out.println(r1);

        //정밀도 차이때문에 (부동소수점 방식) 실수 타입은 0.1을 정확히 표현하기 어려워서 다른 수로 본다.
        //0.1f == 0.1


    }
}
