package ua.lviv.iot.secondProject.BikeDetails;

import ua.lviv.iot.secondProject.BikeDetails.BikeDetails;

public class Flash extends BikeDetails {
    private final String color;

    public Flash(String name, double weight, int price, String manufacture, String color) {
        super(name, weight, price, manufacture);
        this.color = color;
    }

    public String getColor() { return color; }

    @Override
    public void PrintInfo() {
        System.out.println("Name: " + this.getName() + "\n" +
                "Weight: " + this.getWeight() + " g\n" +
                "Price: " + this.getPrice() + " uah\n" +
                "Manufacture: " + this.getManufacture() + "\n" +
                "Color: " + this.getColor() + "\n");
    }
}
