package day08_0117;

import java.util.StringTokenizer;

//StringTokenizer 클래스
//문자열을 구분자를 기준으로 토큰이라는 여러개의 문자열로 잘라낼때 사용
public class StringToken {
    public static void main(String[] args) {
        String str = "Welcome Java Programming";
        StringTokenizer st = new StringTokenizer(str);
        System.out.println(st.countTokens());

        System.out.println("---------------------------");

        while(st.hasMoreElements()){
            System.out.println(st.nextToken());
        }

    }
}
