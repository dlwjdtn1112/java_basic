package day10_0121;

public class BarcaEx {
    public static void main(String[] args) {
        Barca B = new Barca();
        B.setName("valde");
        System.out.println(B.getName());


        System.out.println("자식클래스");

        Xavi x = new Xavi();

        System.out.println(x.name);
        x.setName("사비");
        System.out.println(x.getName());
        x.num = 12;
        System.out.println(x.num);
    }
}
