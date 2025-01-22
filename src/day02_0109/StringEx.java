package day02_0109;

public class StringEx {
    public static void main(String[] args) {
        String v1 = "홍장군";
        char v2 = 'A';
        System.out.println(v1);

        String v3 = new String("홍길동");

        System.out.printf("%c %s %s\n",v2,v1,v3);
        System.out.println(v3.hashCode());
        System.out.println(v1.hashCode());

    }

}
