package day09_0120;

public class CarEx {
    public static void main(String[] args) {
        Avante avante = new Avante(2025);

        avante.stopEngine();
        avante.startEngine();
        avante.drive();
        avante.year = 2034;

        System.out.println(avante.year);
        System.out.println(avante.brand);

    }

}
