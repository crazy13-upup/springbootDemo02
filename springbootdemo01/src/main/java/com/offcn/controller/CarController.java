package com.offcn.controller;

import com.offcn.dao.CarDao;
import com.offcn.entity.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarDao carDao;

    @RequestMapping("/saveInfo")
    @ResponseBody
    public String saveInfo(){
        Car car = new Car();
        car.setBrand("宝马");
        car.setPrice(8888.8);
        carDao.save(car);
        return "SUCCESS";
    }

    @RequestMapping("/getCarList")
    public ModelAndView getCarList(){
        List<Car> carList = carDao.findAll();
        ModelAndView modelAndView = new ModelAndView("car");
        modelAndView.addObject("carList",carList);
        return modelAndView;
    }

}
