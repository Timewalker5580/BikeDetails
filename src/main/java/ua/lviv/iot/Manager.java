package ua.lviv.iot;

import ua.lviv.iot.ua.lviv.iot.BikeDetail;
import ua.lviv.iot.ua.lviv.iot.Bikeable;

import java.util.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Manager {
    private List<BikeDetail> details = new ArrayList<>();


    public void sortByWeight(boolean lever){
        if(lever) {
            details.sort((o1, o2) -> (int) (o2.getWeight() - o1.getWeight()));
        } else {
            details.sort(Comparator.comparingDouble(BikeDetail::getWeight));
        }
    }

    public void sortByManufacture(boolean lever) {

        if(lever) {
            Comparator manufactureComparator = Comparator.comparing(Bikeable::getManufacture).reversed();
            details.sort(manufactureComparator);
        } else {
            Comparator manufactureComparator = Comparator.comparing(Bikeable::getManufacture);
            details.sort(manufactureComparator);
        }
    }

    public void addDetail(BikeDetail detail){
        details.add(detail);
    }

    @Override
    public String toString() {
        return "\ndetails =\n" +
                details.stream().flatMap(a -> Stream.of(a.toString())).collect(Collectors.joining(" \n "," [ "," ] "));
    }
}
