package ua.lviv.iot.ua.lviv.iot;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Flash extends Pump {
    private double weight;
    private String manufacture;

    protected Flash() {}
    public Flash(double weight, String manufacture) {
        this.weight = weight;
        this.manufacture = manufacture;
    }
}
