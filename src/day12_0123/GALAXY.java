package day12_0123;

public class GALAXY {
    String modelName;
    int year = 0;


    public void setModelName(String newName){
        modelName = newName;
    }

    public void setYear(int newYear){
        year = newYear;
    }

    public String getModelName(){
        System.out.println("현재 모델명은"+ modelName + "입니다.");
        return modelName;
    }

    public int getYear(){
        System.out.println("현재 모델의 출시연도 : " + year + "입니다,");
        return year;
    }

}
class GALAXY_SLIM extends GALAXY{
    //boolean slim = true;
    int thickness = 0;

    void setThickness(int newTickness){
        thickness =  newTickness;
    }
    int getThickness(){
        return thickness;
    }

    void checkThickness(int thickness){
        if(thickness > 6){
            System.out.println(modelName + " 다시 제작!!!");
        }
        else{
            System.out.println(modelName + " 출시 가능");
        }
    }

}

class GALAXY_FE extends GALAXY{
    int possible_price = 0;

    public void setPossible_price(int newPrice){
        possible_price  = newPrice;
    }
    public int getPossible_price(){
        return possible_price;
    }
    public void check_price(){
        if(possible_price >= 300000){
            System.out.println("출시 가능");
        }
        else{
            System.out.println("출시 불가능");
        }
    }
}
