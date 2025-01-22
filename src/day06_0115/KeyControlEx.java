package day06_0115;
// CLI Application : 키보드에서 1(증가),2(감소),3(프로그램 종료) 입력했을 때 속도를 증가,감소
import java.util.Scanner;

public class KeyControlEx {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        //int a = in.nextInt(); //입력한 값은 heap에 저장
        boolean run = true;  //현실세계에서 자동차를 달리다. ==> 컴퓨터 세계
        // boolean run  =true(엔진을 켜서 달리다.)
        int speed = 0; // 스택

        while(run){//run은 스택
            System.out.println("-----------------------------");
            System.out.println("1. 속도증가 | 2. 감속 | 3. 중지");
            System.out.println("-----------------------------");
            System.out.println("선택하세요.");

            String strNum = in.nextLine();//키보드에서 입력한 내용 읽어서 변수에 저장한다.heap에 저장

            if(strNum.equals("1")){//실제값을 비교는 equals로 해야 함.
                speed ++;
                System.out.println("현재 속도 = "+ speed);
            }
            else if(strNum.equals("2")){
                speed --;
                System.out.println("현재속도 = "+speed);
            }
            else if(strNum.equals("3")){
                run = false;
            }

        }
        System.out.println("프로그램 종료");
    }
}
