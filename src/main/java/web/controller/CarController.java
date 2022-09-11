package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

@Controller
public class CarController {
	private final CarDAO carDAO;

	public CarController(CarDAO carDAO) { this.carDAO = carDAO; }

	@GetMapping(value = "/cars")
	public String getCarList(Model model,@RequestParam(value = "count", required = false) Integer count) {
		if ((count == null) || (count > 5)) {count = 5;}
		model.addAttribute("cars", carDAO.getCarList(count));
		return "cars";
	}
}