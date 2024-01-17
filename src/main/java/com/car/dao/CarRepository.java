package com.car.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.car.bean.Car;
import com.car.dao.CarRepository;
public interface CarRepository extends CrudRepository<Car, Integer> {
}