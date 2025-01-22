package day09_0120;

import java.util.Scanner;

public class WelcomeBook {
    static Scanner in  = new Scanner(System.in);
    static final int MAX_BOOK = 3;
    static final int MAX_ITEM = 7;

    public static void main(String[] args) {
        String[][] mbook = new String[MAX_BOOK][MAX_ITEM];


        while(true){
            menu();
            System.out.println("메뉴를 선택하세요.");
            int input = in.nextInt();

            if(input == 4){
                menuCarAddItem(mbook);

            }
            else if(input == 8){
                menuExit();
                break;

            }

        }

        //menuCarAddItem(mbook);
        //menuCartItem(mbook);

    }


    public static void menuExit(){
        System.out.println("프로그램을 종료합니다.");
    }

    public static void Booklist(String[][] book){
//        book[0][0] = "ISBN1234";
//        book[0][1] = "쉽게 배우는 JSP 웹 프로그래밍";
//        book[0][2] = "27000";
//        book[0][3] = "송미영";
//        book[0][4] = "단계별로 쇼핑몰로 구현하며 배우는 JSP 웹 프로그래밍";
//        book[0][5] = "IT 전문서";
//        book[0][6] = "2018/10/08";
//
//        book[1][0] = "ISBN1235";
//        book[1][1] = "안드로이드 프로그래밍";
//        book[1][2] = "33000";
//        book[1][3] = "우재남";
//        book[1][4] = "실습 단계별 명료한 멘토링!";
//        book[1][5] = "IT 전문서";
//        book[1][6] = "2022/01/22";
//
//        book[2][0] = "ISBN1236";
//        book[2][1] = "스크래치";
//        book[2][2] = "27000";
//        book[2][3] = "고광일";
//        book[2][4] = "컴퓨팅 사고력을 키우는 블록 코딩";
//        book[2][5] = "컴퓨터 입문";
//        book[2][6] = "2019/06/10";

        for(int i = 0; i < MAX_BOOK; i++){
            System.out.printf("%d 번째 정보를 입력하세요 : "+ i + 1);
            for(int j = 0; j < MAX_ITEM; j++){
                System.out.print("해당 책의 정보를 7번으로 나누어 입력하세요.");
                book[i][j] = in.nextLine();

            }
        }


    }
    public static void menuCarAddItem(String[][] book){
        System.out.println("장바구니에 항목 추가하기");
        Booklist(book);
        for(int i = 0; i < MAX_BOOK;i++){
            for(int j = 0; j <MAX_ITEM;j++){
                System.out.print(book[i][j] + " | ");

            }
            System.out.println();
            //menuCartItem(book);
        }
        menuCartItem(book);
    }
    public static void menuCartItem(String[][] book){
        boolean quit = false;

        while(!quit){
            System.out.println("장바구니 추가할 도서의 ID를 입력하세요 : ");
            String str = in.nextLine();

            boolean flag = false;
            int numid = -1;

            for(int i = 0; i < MAX_BOOK;i++){
                if(str.equals(book[i][0])){
                    numid = i;
                    flag = true;
                    break;
                }


            }
            if(flag){
                System.out.println("장바구니에 추가하시겠습니까?");
                str = in.nextLine();
            }
            if(str.equals("Y")){
                System.out.println(book[numid][0]+"도서가 장바구니에 추가");
                quit = true;
                //break;
            }
            else{
                System.out.println("다시 입력해주세요.");
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
}
