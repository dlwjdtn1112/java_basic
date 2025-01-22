package day09_0120;

public class Car {
    // 공통 필드
    String brand;
    String model;
    int year;

    // 생성자
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    // 공통 메서드
    public void startEngine() {
        System.out.println(model + ": 엔진이 켜졌습니다!");
    }

    public void stopEngine() {
        System.out.println(model + ": 엔진이 꺼졌습니다!");
    }

    public void drive() {
        System.out.println(model + ": 주행 중입니다.");
    }
}

// 아반떼 클래스
class Avante extends Car {
    public Avante(int year) {
        super("Hyundai", "Avante", year);
    }

    public void compactFeature() {
        System.out.println(model + ": 소형 차량으로 연비가 우수합니다!");
    }
}

// 소나타 클래스
class Sonata extends Car {
    public Sonata(int year) {
        super("Hyundai", "Sonata", year);
    }

    public void familyFeature() {
        System.out.println(model + ": 중형 차량으로 가족이 타기에 적합합니다!");
    }
}

// 그랜저 클래스
class Grandeur extends Car {
    public Grandeur(int year) {
        super("Hyundai", "Grandeur", year);
    }

    public void luxuryFeature() {
        System.out.println(model + ": 고급 차량으로 편의 사양이 뛰어납니다!");
    }
}

// 산타페 클래스
class SantaFe extends Car {
    public SantaFe(int year) {
        super("Hyundai", "SantaFe", year);
    }

    public void suvFeature() {
        System.out.println(model + ": SUV로 다양한 지형에서 주행이 가능합니다!");
    }
}
