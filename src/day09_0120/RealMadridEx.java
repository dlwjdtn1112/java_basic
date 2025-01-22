package day09_0120;

public class RealMadridEx {
    public static void main(String[] args) {
        Valvarde v1 = new Valvarde();
        System.out.println("----------------------");
        System.out.println(v1.Pos);
        System.out.println(v1.name);
        System.out.println(v1.from);
        System.out.println(v1.num);

        System.out.println("======================");
        RealMadrid Vini = new RealMadrid();
        RealMadrid Val = new RealMadrid();

        //Val.setNum(8);
        //Val.setPos("MF");
        System.out.println(Val.getPos());
        System.out.println(Val.getNum());


//        Vini.num= 7;
//        Vini.Pos = "FW";
//
//        RealMadrid Rodrigo = new RealMadrid();
//        Rodrigo.num =  11;
//        Rodrigo.Pos = "FW";
//
//        System.out.println(Vini.num);
//        System.out.println(Vini.Pos);
//        System.out.println(Rodrigo.num);
//        System.out.println(Rodrigo.Pos);
        Vini.setNum(7);
        int a = Vini.getNum();
        System.out.println(Vini.getNum());
        System.out.println(a);

        Vini.setPos("FW");
        String b  = Vini.getPos();
        System.out.println(b);
        System.out.println(Vini.getPos());


    }
}
