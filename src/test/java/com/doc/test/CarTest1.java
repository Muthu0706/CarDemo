package com.doc.test;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.car.bean.Car;
import com.car.controller.CarController;
import com.car.dao.CarRepository;

import org.junit.Test;
import org.springframework.test.annotation.Rollback;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;

@SpringBootApplication
public class CarTest1{
	
	private CarController controller;
	private Car car;
	private CarRepository carrespostitry;
	
	
	
    @Test
    @Order(1)
    @Rollback(value = false)
    public void testPerformInsert(){
    	
       		Car obj=new car();
	obj.setCarno("TN456");
		obj.setDateofbooking("12-12-23");
		obj.setFromlocation("Tenkasi");
		obj.setTolocation("Chennai");
	    obj.setBookedname("Raja");
	    obj.setBookedphonenumber("34567867");
	    obj=controller.performInsert(car);
	    org.junit.Assert.assertEquals(obj, Car);
    }
}