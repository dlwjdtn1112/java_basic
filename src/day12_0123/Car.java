package day12_0123;

public class Car {
    int num;
    double gas;

    int getNum(){
        System.out.println("차량 번호를 조사했습니다.");
        return num;
    }
    double getGas(){
        System.out.println("연료량을 조사했습니다.");
        return gas;
    }

    void setNumGas(int n,double g){
        num = n;
        gas = g;
        System.out.println("차량번호를 " + num + " 연료량을 " + gas+"로 변경을 하였습니다.");

    }
}
