package web.model;

import web.Car;

import java.util.ArrayList;
import java.util.List;

public class CarModel {

    public static List<Car> getCarList() {
        List<Car> carList = new ArrayList<>();
        carList.add(new Car("Cadillac", "Grey", 6));
        carList.add(new Car("Chevrolet", "Orange", 4));
        carList.add(new Car("BMW", "White", 14));
        carList.add(new Car("Mercedes", "Black", 2));
        carList.add(new Car("Ford", "Red", 1));
        return carList;
    }
}
