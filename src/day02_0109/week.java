package day02_0109;
import java.util.Scanner;
public class week {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int sum = 0;
        int value = 10;
        sum += value;
        //add(sum);
        int sum1 = 0;
        sum1 += value;

        int value1 = 10;
        divide(sum);


    }
    private static  void divide(int sum){
        int value = sc.nextInt();
        sum *= value;
        System.out.println(sum);

    }

    private static void add(int sum){
        int value =sc.nextInt();
        sum += value;
        System.out.println(sum);
    }
}












