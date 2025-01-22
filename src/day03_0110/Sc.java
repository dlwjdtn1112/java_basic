package day03_0110;

import java.util.Scanner;

public class Sc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("x의 값 입력");

        String strX = input.nextLine();


        int x = Integer.parseInt(strX);
        System.out.println(x);

        System.out.println("y의 값 입력");
        String strY = input.nextLine();
        int y = Integer.parseInt(strY);
        System.out.println(y);
        int cnt = 1;

        //문자열은 연산이 되지 않기 때문에 알맞은 타입으로 캐스팅기능을 제공하는 각 래퍼클래스를 활용하여 변경


        while(true){
            System.out.println("종료하려면 quit를 해라 : ");
            String data = input.nextLine();
            if(data.equals("quit")){
                break;
            }


        }
        System.out.println("종료");



    }
}
