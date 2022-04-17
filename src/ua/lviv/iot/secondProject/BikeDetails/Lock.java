package ua.lviv.iot.secondProject.BikeDetails;

import ua.lviv.iot.secondProject.BikeDetails.Flash;

public class Lock extends Flash {
    private final int size1;
    private final int size2;

    public Lock(String name, double weight, int price, String manufacture, String color, int size1, int size2) {
        super(name, weight, price, manufacture, color);
        this.size1 = size1;
        this.size2 = size2;
    }

    public int getSize1() { return size1; }
    public int getSize2() { return size2; }

    @Override
    public void PrintInfo() {
        System.out.println("Name: " + this.getName() + "\n" +
                "Weight: " + this.getWeight() + " g\n" +
                "Price: " + this.getPrice() + " uah\n" +
                "Manufacture: " + this.getManufacture() + "\n" +
                "Color: " + this.getColor() + "\n" +
                "Size: " + this.getSize1() + " x " +
                this.getSize2() + " mm\n");
    }
}



