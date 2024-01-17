package com.car.controller;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.car.bean.Car;

@RestController
public class CarController {

  @GetMapping("/performInsert")
  public List<Car> getAllCar(){
    //Returns hardcoded data, a real world application would return from the database
    List<Car> carList = new ArrayList<Car>();
    carList.add(new Car("TN456","12-12-23","Tenkasi","Chennai","Raja","34567867"));
    carList.add(new Car("TN457","12-12-23","Tenkasi","Chennai","Raja","34567867"));
    return carList;
  } 
  @GetMapping("/performInsert/{carNo}")
  public Car getPersonWithId(@PathVariable Integer personId){
    return new Car("TN457","12-12-23","Tenkasi","Chennai","Raja","34567867");
  } 
  @PostMapping("/performInsert/newperson")
  public void addCar(@RequestBody Car car){
    //Just has a Sysout stmt, a real world application would save this record to the database
    System.out.println("Saving person information");
    
  }
public Car performInsert(Car car) {
	// TODO Auto-generated method stub
	return null;
}
}
