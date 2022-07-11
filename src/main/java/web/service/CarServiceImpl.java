package web.service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import web.dao.CarDao;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getCars(int count) {
        return carDao.getCarList().subList(0, count);
    }

}
