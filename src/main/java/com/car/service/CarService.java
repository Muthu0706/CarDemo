package com.car.service;

import java.util.ArrayList;  
import java.util.List;  
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.stereotype.Service;  
import com.car.bean.Car;  
import com.car.dao.CarRepository;  
//defining the business logic  
@Service  
public class CarService   
{  
@Autowired
static  
CarRepository carRepository;  

public List<Car> getAllCar()   
{  
List<Car> car = new ArrayList<Car>();  
carRepository.findAll().forEach(car1 -> car.add(car1));  
return car;  
}  

public Car getCarByNo(int no)   
{  
return carRepository.findById(no).get();  
}  
//saving a specific record by using the method save() of CrudRepository  
public static  void saveOrUpdate(Car car)   
{  
carRepository.save(car);  
}   
}  