package web.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.Objects;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        List<Car> listCar = carDao.getCarList();

        if (count > listCar.size()) {
            return listCar;
        }

        return listCar.subList(0, count);
    }

}
