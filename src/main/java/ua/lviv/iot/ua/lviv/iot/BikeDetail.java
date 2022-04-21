package ua.lviv.iot.ua.lviv.iot;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@ToString

public class BikeDetail implements Bikeable {
    private double weight;
    private String manufacture;

    BikeDetail() {}
    public BikeDetail(double weight, String manufacture) {
        this.weight = weight;
        this.manufacture = manufacture;
    }
}
