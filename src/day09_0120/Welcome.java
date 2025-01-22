package day09_0120;

import java.util.Scanner;

public class Welcome {
    static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {

        String v1 = "Welcome to Shopping Mall";
        String v2 = "Welcome to Book Market!";
        System.out.print("당신의 이름을 입력하세요 : ");
        String username = in.next();
        System.out.print("연락처를 입력하세요 : ");
        String userMobile = in.next();
        System.out.println("*".repeat(35));
        System.out.println(v1);
        System.out.println("       "+v2+"      ");
        System.out.println("*".repeat(35));

        boolean quit = false;

        while(!quit){
            //System.out.println("*".repeat(35));
            //System.out.println("\t" + v1);
            //System.out.println("\t" + v2);
            menu();

            System.out.println("메뉴번호를 선택하세요 : ");
            int n = in.nextInt();
            if(n < 1 || n >8){
                System.out.println("1부터 8까지 입력하세요 : ");
            }
            else{
                switch (n){
                    case 1:
                        //System.out.println("현재 고객 정보 : ");
                        menuGuestInfo(username,userMobile);
                        break;
                    case 2:
                        //System.out.println("장바구니 상품 목록 보기 ");
                        menuCarList();
                        break;
                    case 3:
                        //System.out.println("장바구니 비우기");
                        menuClear();
                        break;
                    case 4:
                        //System.out.println("장바구니 항목 추가하기");
                        menuadd();
                        break;
                    case 5:
                        //System.out.println("장바구니 수량 줄이기");
                        menuRemove();
                        break;
                    case 6:
                        //System.out.println("장바구니 항목 삭제하기");
                        menuRemoveItem();
                        break;
                    case 7:
                        //System.out.println("영수증 표시하기");
                        menuBill();
                        break;
                    case 8:
                        //System.out.println("종료");
                        menuExit();
                        quit = true;
                        break;


                }
            }



        }


    }
    public static void menu(){
        System.out.println("*".repeat(35));
        System.out.println("1. 고객 정보 확인하기 \t4. 바구니에 항목 추가하기");
        System.out.println("2. 장바구니 상품 목록 보기\t5.장바나의 항목 추가하기");
        System.out.println("3.장바구니 비우기\t6. 장바구니의 항복 삭제하기");
        System.out.println("7. 영수증 표시하기\t 8.종료");
        System.out.println("*".repeat(35));
        //System.out.println("메뉴 번호를 선택해주세요 : ");
        //int a = in.nextInt();

    }
    public static void menuGuestInfo(String a,String b){
        System.out.println("고객 이름 : "+ a);
        System.out.println("고객 연락처 : "+ b);
    }
    public static void menuCarList(){
        System.out.println("2.장바구니 상품 목록 보기");
    }

    public static void menuClear(){
        System.out.println("3.장바구니 비우기");
    }
    public static void menuadd(){
        System.out.println("4.장바구니 항목 추가히기");
    }
    public static void menuRemove(){
        System.out.println("5.장바구니 수량 줄이기");
    }
    public static void menuRemoveItem(){
        System.out.println("6.장바구니 항목 삭제하기");
    }
    public static void menuBill(){
        System.out.println("7.영수증 표시하기");
    }
    public static void menuExit(){
        System.out.println("종료");
    }

}
