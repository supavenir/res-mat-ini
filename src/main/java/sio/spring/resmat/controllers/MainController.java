package sio.spring.resmat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import sio.spring.resmat.services.NavigationService;

@Controller
public class MainController {

	private final NavigationService navigationService;

	MainController(NavigationService navigationService) {
		this.navigationService = navigationService;
	}

	@GetMapping
	public String index(ModelMap model) {
		model.put("liensNavigation", navigationService.liensPour("accueil", "/"));
		return "index";
	}
}
