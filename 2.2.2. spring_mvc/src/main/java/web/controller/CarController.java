package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {


    private final CarServiceImp carServiceImp;

    @Autowired
    public CarController(CarServiceImp carServiceImp) {
        this.carServiceImp = carServiceImp;

    }

    @GetMapping("/car")
    public String printCars(ModelMap model, @RequestParam(value = "count", required = false) Integer count) {
        model.addAttribute("cars", carServiceImp.showCar(count));
        return "car";
    }

}
