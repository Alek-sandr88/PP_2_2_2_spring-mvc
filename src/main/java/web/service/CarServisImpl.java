package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.dao.CarDaoImp;
import web.model.Car;

import java.util.List;


@Service
public class CarServisImpl implements CarService {
    private CarDao dao;

    @Autowired
    public CarServisImpl(CarDao dao) {
        this.dao = dao;
    }

    @Override
    public List<Car> getListCar(int count) {
        return dao.getListCar(count);
    }
}
