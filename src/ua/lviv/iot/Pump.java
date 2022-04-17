package ua.lviv.iot;

public class Pump extends Lock{
    private double weight;
    private String manufacture;

    protected Pump() {}
    public Pump(double weight, String manufacture) {
        this.weight = weight;
        this.manufacture = manufacture;
    }

    @Override
    public double getWeight() {
        return weight;
    }

    @Override
    public String getManufacture() {
        return manufacture;
    }

    @Override
    public String toString() {
        return "Pump: weight = " + weight + "; manufacture = " + manufacture;
    }
}
