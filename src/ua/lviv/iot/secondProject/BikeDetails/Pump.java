package ua.lviv.iot.secondProject.BikeDetails;

import ua.lviv.iot.secondProject.BikeDetails.BikeDetails;

public class Pump extends BikeDetails {
    private final int size1;
    private final int size2;
    private final int size3;

    public Pump(String name, double weight, int price, String manufacture, int size1, int size2, int size3) {
        super(name, weight, price, manufacture);
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public int getSize1() { return size1; }
    public int getSize2() { return size2; }
    public int getSize3() { return size3; }

    @Override
    public void PrintInfo() {
        System.out.println("Name: " + this.getName() + "\n" +
                "Weight: " + this.getWeight() + " g\n" +
                "Price: " + this.getPrice() + " uah\n" +
                "Manufacture: " + this.getManufacture() + "\n" +
                "Size: " + this.getSize1() + " x " +
                this.getSize2() + " x " + this.getSize3() + " mm\n");
    }
}
