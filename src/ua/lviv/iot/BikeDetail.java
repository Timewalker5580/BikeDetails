package ua.lviv.iot;

public class BikeDetail implements Bikeable {
    private double weight;
    private String manufacture;

    BikeDetail() {}
    public BikeDetail(double weight, String manufacture) {
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
        return "BikeDetail: weight = " + weight + "; manufacture = " + manufacture;
    }
}
