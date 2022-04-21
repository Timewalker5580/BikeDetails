package ua.lviv.iot;

import ua.lviv.iot.ua.lviv.iot.*;


public class Main {

    public static void main(String[] args) {
        Manager det = new Manager();

        BikeDetail Lock = new Lock(100.00, "Italy");
        det.addDetail(Lock);

        BikeDetail Pump = new Pump(120.00, "China");
        det.addDetail(Pump);

        BikeDetail Flash = new Flash(30.00, "France");
        det.addDetail(Flash);

        System.out.println("Not sorted list:\n" + det);
        det.sortByWeight(true);
        System.out.println("\nSorted list(weight by descending):\n" + det);

        det.sortByWeight(false);
        System.out.println("\nSorted list(weight by ascending):\n" + det);

        det.sortByManufacture(true);
        System.out.println("\nSorted list(manufacture by descending):\n" + det);

        det.sortByManufacture(false);
        System.out.println("\nSorted list(weight by ascending):\n" + det);
    }
}
