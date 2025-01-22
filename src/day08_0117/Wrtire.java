package day08_0117;

import java.io.*;
import java.util.StringTokenizer;

public class Wrtire {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//키보드입력
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//콘솔 출력

//        String str = br.readLine();//한줄에 입력받기
//        bw.write(str);
//        bw.flush();//버퍼 비우기


        int number = Integer.parseInt(br.readLine()); //5를 정수로 형변환하여 저장

        for(int i = 1; i <= number;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());//첫번째로 들어온 숫자
            int second = Integer.parseInt(st.nextToken());//두번째로 입력된 숫자 저장

            bw.write(String.valueOf(first)+" ");
            bw.write(String.valueOf(second)+"\n");

            bw.flush();



        }





    }
}

