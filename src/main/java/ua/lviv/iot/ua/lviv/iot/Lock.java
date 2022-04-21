package ua.lviv.iot.ua.lviv.iot;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class Lock extends BikeDetail {
    private double weight;
    private String manufacture;

    protected Lock() {}
    public Lock(double weight, String manufacture) {
        this.weight = weight;
        this.manufacture = manufacture;
    }
}
