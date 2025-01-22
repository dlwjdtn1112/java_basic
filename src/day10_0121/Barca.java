package day10_0121;

public class Barca {
    String name = "messsi";
    String from = "아르헨티나";

    public void setName(String newName){
        name = newName;

    }
    public String getName(){
        return name;
    }
    public void setFrom(String newFrom){
        from  = newFrom;

    }
    public String getFrom(){
        return from;
    }

}
class Xavi extends Barca{
    String Pos = "MF";
    int num;
}
