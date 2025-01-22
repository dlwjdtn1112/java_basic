package day11_0122.VO;

import java.util.Scanner;

public class BestMovieModeling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //String[] arr = new String[5];
        MovieVO[][] moviearray;
        moviearray = new MovieVO[5][6];
        System.out.println("입력할 영화의 총개수 : ");
        int movietotal = input.nextInt();
        System.out.println("각영화당 상세정보 개수를 입력하세요");
        int movieinfo = input.nextInt();
        moviearray = new MovieVO[movietotal][movieinfo];

        //3개의 영화의 상세정보목록 개수는 3개(title,actor,grade)

        //정보를 입력받고 헤당 영화정보의 내용이 자동으로 movieArray에 할당하도록 만들어라.

        for(int i = 0 ;i < 3;i++){

            MovieVO m1 = new MovieVO();
            moviearray[i][0] = m1;
            for(int j = 1; j < 3;j++){
                m1.setActor("dlwjdtn");

                moviearray[i][j] = m1.getActor();





            }

        }

        for(int movie = 0; movie < 4; movie++){
            for(int j = 0; j < 4;j++){
                MovieVO movieVO = new MovieVO();

                System.out.println("영화타이틀을 입력하세요.");
                String s1 = input.nextLine();
                movieVO.setTitle(s1);
                //moviearray[movie][j] = movieVO.getTitle();

            }


        }










        MovieVO avata = new MovieVO("아바타","12세","액션");
        System.out.println(avata.toString());
        avata.setOpenDay("목요일");
        avata.getOpenDay();
        System.out.println(avata.toString());
        avata.setRunningTime("192");
        avata.getRunningTime();
        System.out.println(avata.toString());
        avata.setActor("dlwjdtn");
        avata.getActor();
        System.out.println(avata.toString());
        System.out.println(avata.getTitle());
//        arr[0] = avata.getTitle();
//        arr[1] = avata.getOpenDay();
//        arr[2] = avata.getActor();
//        arr[3] = avata.getGener();
//        arr[4] = avata.getRunningTime();
//        arr[4] = "186";
//        System.out.println("===================================");
//
//        for(String i : arr){
//            System.out.println(i);
//        }

    }
}
