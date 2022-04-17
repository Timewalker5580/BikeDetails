package ua.lviv.iot;

public class Flash extends Pump{
    private double weight;
    private String manufacture;

    protected Flash() {}
    public Flash(double weight, String manufacture) {
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
        return "Flash: weight = " + weight + "; manufacture = " + manufacture;
    }
}
