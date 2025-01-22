package day03_0110;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {

        int[] arr  = {1,6,2,3,10,7,4,5,8,9};
        int[] arr1 = new int[100];
        System.out.println();
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}

