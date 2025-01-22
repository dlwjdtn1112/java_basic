package day08_0117;
// 자바 문자열 자르는 방법 2가지
// 1. String 클래스의 split() java.lang.String
//  매개변수 갯수가 다른 2개로 오버로딩 되어 있다.
//다형성 : 오버로딩 메서드의 이름이 같으면서 매개변수 타입이나 매개변수 개수를 달리해서
// 2. String tokenizer 클래스 java.util.
public class StringSplitEx {
    public static void main(String[] args) {
        String str = "input@github.com@thatzcool";
        String[] splitter = str.split("@",2);


        for(int i = 0; i < splitter.length; i++){
            System.out.println(splitter[i]);
        }
        System.out.println();
        for(String i : splitter){
            System.out.println(i);
        }

        //System.out.println(splitter[0]);

        String a1 = "dskagpoejg";
        String[] arr = a1.split("");
        for(int i = 0; i < arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
        for(String i : arr){
            System.out.println(i);
        }

    }
}
