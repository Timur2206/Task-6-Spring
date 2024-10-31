package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;
@Service
public class CarServicImp implements CarService{
    @Autowired
    private CarDao carDao;
    @Override
    public List<Car> getCars(int count){
        return carDao.getCars(count);
    }

}
