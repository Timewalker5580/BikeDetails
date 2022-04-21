package ua.lviv.iot.ua.lviv.iot;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Pump extends Lock {
    private double weight;
    private String manufacture;

    protected Pump() {}
    public Pump(double weight, String manufacture) {
        this.weight = weight;
        this.manufacture = manufacture;
    }
}
