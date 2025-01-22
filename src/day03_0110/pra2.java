package day03_0110;

public class pra2 {
    public static void main(String[] args) {

        String str2 = """
                 subject score
                ==============
                  korean    90
                 english   100
                computer    80
                김진수 학생의 점수는\n
                최우수로 졸업했다.
                """;

        System.out.println(str2);

        byte bb = 10;
        int cc = bb;
        long dd = cc;
        float ff = dd;
        double dd1 = ff;//자동 변환이 가능

        System.out.printf("%f",dd1);

        char char1 = 'A';
        int intVaiue = (int)char1;
        System.out.println(char1);
        System.out.println(intVaiue);

        byte byteValue = 65;
        int char2 = byteValue;
        System.out.println(char2);



    }
}
