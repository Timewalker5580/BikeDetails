package ua.lviv.iot;

public class Lock extends BikeDetail {
    private double weight;
    private String manufacture;

    protected Lock() {}
    public Lock(double weight, String manufacture) {
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
        return "Lock: weight = " + weight + "; manufacture = " + manufacture;
    }
}
