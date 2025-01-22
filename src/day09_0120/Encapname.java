package day09_0120;

public class Encapname {
    public static void main(String[] args) {
        Encap en1 = new Encap();
        //en1.name = "d";
        System.out.println(en1.name);//직접 접근 불가
        System.out.println(en1.getName());
        en1.setName("신세계123");
        System.out.println(en1.getName());
        //System.out.println(en1.name);


    }
}
//객체지향에서 캡슐화라는 의미는 클래스 멤버의 보호
//안전하게 직접 접근을 제한하여 조작을 하는것을 방지한다.
//다만 public 메소드를 통해서 해당 데이터를 보고, 데이터를 변경하는 것을 간접적으로 지원한다.
