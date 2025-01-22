package day12_0123;

import java.util.Scanner;

public class GalaxyMain {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        GALAXY s24 = new GALAXY();
        GALAXY s23 = new GALAXY();
        GALAXY_SLIM s25_slim =  new GALAXY_SLIM();
        GALAXY_FE s24_fe = new GALAXY_FE();
        s25_slim.setModelName("GALAXY S25_SLIM");
        s25_slim.setYear(2025);
        System.out.println("GALAXY SLIM 두께를 입력하세요. ");
        int a  = in.nextInt();
        s25_slim.thickness = a;
        s25_slim.checkThickness(s25_slim.thickness);


        s23.setModelName("GALAXY S23");
        s24.setModelName("GALAXY S24");

        s23.setYear(2023);
        s24.setYear(2024);

        String v1 = s23.getModelName();
        int v2 = s23.getYear();
        System.out.println(v1);
        System.out.println(v2);
        System.out.println("FE");

        s24_fe.setModelName("GLALXY S24 FE");
        s24_fe.setYear(2024);
        s24_fe.setPossible_price(300000);
        s24_fe.check_price();




    }
}
