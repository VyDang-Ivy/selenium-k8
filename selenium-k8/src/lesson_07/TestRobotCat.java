package lesson_07;

import java.awt.*;

public class TestRobotCat {

    public static void main(String[] args) {
        RobotCat batteryRobotCat = new BatteryRobotCat();
        RobotCat solarRobotCat = new SolarRobotCat();

        batteryRobotCat.setName("Kitty");
        batteryRobotCat.setProductionDate("24/06/2022");

        solarRobotCat.setName("Mew");
        solarRobotCat.setProductionDate("24/06/2022");

        System.out.println(batteryRobotCat);
        System.out.println(solarRobotCat);

        System.out.println(batteryRobotCat.charge());
        System.out.println(solarRobotCat.charge());

        batteryRobotCat.doSth();


    }
}
