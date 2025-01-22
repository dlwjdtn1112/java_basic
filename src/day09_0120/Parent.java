package day09_0120;

public class Parent {
    private String breed = "샵 고양이";
    void methodParentCat(){
        System.out.println("어미 고양이 냐옹");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}

class Kitten extends Parent {
    void methodKitten() {
        System.out.println("새끼 고양이 냐옹");

    }
}
