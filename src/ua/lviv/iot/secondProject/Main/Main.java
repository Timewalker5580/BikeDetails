package ua.lviv.iot.secondProject.Main;

import ua.lviv.iot.secondProject.BikeDetails.Flash;
import ua.lviv.iot.secondProject.BikeDetails.Pump;
import ua.lviv.iot.secondProject.BikeDetails.Lock;

public class Main {
    public static void main(String[] args) {
        Flash flash1 = new Flash("Ліхтар задній Jing Yi JY-6028T", 50.00, 207, "China", "black");
        flash1.PrintInfo();
        Flash flash2 = new Flash("Ліхтар передній Jing Yi JY-810", 100.00, 111, "China", "black-grey");
        flash2.PrintInfo();

        Pump pump1 = new Pump("Насос підлоговий Bee Pumps ZF-042 з манометром", 1200.00, 367, "China", 600,180, 1200);
        pump1.PrintInfo();
        Pump pump2 = new Pump("Насос ручний Giyo GP-04", 205.00, 199, "China(Taiwan)", 600,180, 1200);
        pump2.PrintInfo();

        Lock lock1 = new Lock("Кодовий замок TRINX TL04 з кріпленням", 670, 325, "China", "black", 1200, 12);
        lock1.PrintInfo();
        Lock lock2 = new Lock("Замок TRINX TL03 з кріпленням", 450, 240, "China", "black", 1200, 12);
        lock2.PrintInfo();
    }
}