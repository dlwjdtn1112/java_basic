package day05_0114;

import com.sun.source.tree.ContinueTree;

import java.util.Scanner;

public class For {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        //System.out.println("Number? ");
        char ch = in.next().charAt(0);

        switch (ch){
            case 'A':
                System.out.println("매우 우수");
                break;
            case 'B':
                System.out.println("우수");
                break;
            case 'C':
                System.out.println("좋음");
                break;
            default:
                System.out.println("오류");

        }
        for(int i = 1; i < 10;i++){
            System.out.println("-----------------");
            for(int j = 1; j <10;j++){
                int v1 = i * j;
                System.out.println(i + " * " + j + " = "+ v1);
                //System.out.println("-----------------");
            }
        }

        int[] arr = new int[4];

        for(int i = 0;i <arr.length;i++){
            arr[i] = i;
            System.out.println(arr[i]);

        }

        for(int i = 0; i < 10;i++){
            System.out.print(i + " ");
        }


    }
}
