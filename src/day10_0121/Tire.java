package day10_0121;

public class Tire {
    private String model;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tire{" +
                "model='" + model + '\'' +
                '}';
    }
}
