package day12_0123;

public class CarMain {
    public static void main(String[] args) {
        Car avante = new Car();
        Car santafe = new Car();

        avante.setNumGas(1112,87.8);
        santafe.setNumGas(1113,89.8);

        avante.getNum();
        avante.getGas();

        santafe.getNum();
        santafe.getGas();


    }
}
