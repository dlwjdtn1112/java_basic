package day08_0117;

public class StringBufferEx {
    public static void main(String[] args) {
        //StringBuffer의
        StringBuffer sb = new StringBuffer(); //StringBuffer클래스 생성
        StringBuffer sb1 = new StringBuffer(); //StringBuffer클래스 생성

        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb);

        System.out.println(sb.capacity()); //StingBuffer 변수의 배열 용량 크기 반환
        System.out.println(sb.capacity()); //StingBuffer 변수의 배열 용량 크기 반환

        sb1.append("11111111111111111111111111");
        System.out.println(sb1.capacity());
        System.out.println("-------------------------");
        String result1 = sb1.toString();
        System.out.println(result1);

        String str3 = "abcdefg";
        StringBuffer sb2 = new StringBuffer(str3);// String -> StringBuffer 클래스 형변환
        System.out.println("처음 상태 : " + sb2);

        //StringBuffer -> String
        System.out.println(sb2.toString());
        System.out.println("문자열 추출 : " + sb2.substring(2,4) );
        //System.out.println("문자열 추가 : " + sb2.insert(6,"y"));
        System.out.println("문자열 삭제 : " + sb2.delete(3,6));//인덱스 3,4,5 삭제
        System.out.println("문자열 추가 : "+ sb2.append("하하하하"));
        System.out.println("문자열 길이 : "+ sb2.length());
        System.out.println(sb2.reverse());
        //최종 데이터가 완성이 되면 Sting으로 마무리

        System.out.println(sb2.toString());

        String star = "*";

        for(int i = 1; i< 10;i++){
            star += "*";
        }
        System.out.println(star);

        StringBuffer sb3 = new StringBuffer("*");
        sb3.append("***");
        System.out.println(sb3.toString());

        String str4 = "hello" + "world";
        String str5 = new StringBuffer("hello").append("world").toString();
        System.out.println(str5);
        System.out.println(str4);

        StringBuilder sb4 = new StringBuilder();
        for(int  i = 0; i < 10000;i++){
            sb4.append(i);
        }

        final String number = sb4.toString();
        System.out.println(number);
        // 문자열 연산이 많을 경우 StringBuilder 객체로 문자열을 생성해서 다루는 것이 성능을 고려하는데 좋다.
        //



    }
}
