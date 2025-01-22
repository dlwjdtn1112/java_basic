package day09_0120;

public class RealMadrid {
    String Pos = "DF";
    int num = -1;


    public void setNum(int newNum){
        num = newNum;
    }
    public int getNum(){
        return num;
    }
    public void setPos(String newPos){
        Pos = newPos;
    }
    public String getPos(){
        return Pos;
    }


}

class Valvarde extends RealMadrid{
    String name = "페데리코";
    String from = "우루과이";
}
