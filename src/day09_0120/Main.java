package day09_0120;

public class Main {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = new StringBuffer();

        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        sb.append("Welcome");
        String result = sb.toString();
        System.out.println(result);
        System.out.println(sb);
        sb.append("we");
        System.out.println(sb);

        sb1.append("111111111111111111111111111111");
        System.out.println(sb1.capacity());

        System.out.println("-------------------");

        String str3 = "abcdefg";
        StringBuffer sb2 = new StringBuffer((str3));
        System.out.println("처음 상태 : "+sb2);
        System.out.println(sb2.substring(2,4));
        System.out.println(sb2.insert(0,'b'));
        System.out.println(sb2.delete(3,6));
        System.out.println(sb2.reverse());

        String str4 = "Hello" + "World";
        String str5 = new StringBuffer("hello").append("World").toString();
        System.out.println(str5);
        System.out.println(str4);

        System.out.println("--------------------------");
        StringBuilder sb4 = new StringBuilder();

        for(int i = 0; i < 10;i++){
            sb4.append(i+" ");
        }
        System.out.println(sb4);
        System.out.println(sb4.toString());

        StringBuffer sb5 = new StringBuffer();
        for(int i = 0; i <1000; i++){
            sb5.append(i);
        }
        System.out.println(sb5);

    }
}
