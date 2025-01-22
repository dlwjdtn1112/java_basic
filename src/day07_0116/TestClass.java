package day07_0116;

import java.util.Scanner;

class Car{
    String color;
    void colorReturn(){
        System.out.println("자동차 색은" + this.color);
    }
}
//import java.util.Scanner;

public class TestClass {
    //static Scanner in  = new Scanner(System.in);
    public static void main(String[] args) {
        //int number = 1;
       // Scanner in = new Scanner(System.in);

        Car car1 = new Car();
        Car car2 = new Car();

        //System.out.println(number);
        //System.out.println(in.getClass().getName());
        System.out.println(car1.toString());
        System.out.println(car2.toString());

        car1.color = "red";
        car2.color = "blue";

        System.out.println(car1.color);
        System.out.println(car2.color);




    }
}
