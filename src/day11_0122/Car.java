package day11_0122;

public class Car {
    String model;
    String owner;
    int speed  = 0;

    public void setSpeed(int newSpeed){
        speed = newSpeed;

    }
    public int getSpeed(){
        return speed;
    }
    public void UpSpeed(){
        speed++;
        System.out.println("현재속도 : "+ speed);
    }

    public void DownSpeed(){
        speed--;

        if(speed == 0){
            System.out.printf("현재 속도 : %d , STOP",speed);
        }
        else{
            System.out.println("현재속도 : "+ speed);
        }
    }

}
