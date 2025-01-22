package day06_0115;

import java.util.Random;
import java.util.Scanner;

public class RandomEx {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        Random random =  new Random(); // Random 클래스를 실체화한다.
        //0~3까지의 범위의 난수 생성
        //int a = random.nextInt(4);

        for(int i = 1; i <= 20; i++){
            int a = random.nextInt(105,121);
            System.out.print(a + " ");

        }
        System.out.println();
        System.out.println("---------------");

        long l = random.nextLong();
        float f = random.nextFloat();
        double d = random.nextDouble();
        boolean b = random.nextBoolean();
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(b);

        int num6 = random.nextInt();

    }
}
