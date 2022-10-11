package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServisImpl;

@Controller
@RequestMapping("/cars")
public class CarController {
    private CarServisImpl carServis;

    @Autowired
    public CarController(CarServisImpl carServis) {
        this.carServis = carServis;
    }

    @GetMapping()
    public String getCars(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars",carServis.getListCar(count));
        return "/cars";
    }

}
