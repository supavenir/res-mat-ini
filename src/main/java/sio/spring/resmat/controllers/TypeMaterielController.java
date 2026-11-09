package sio.spring.resmat.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import sio.spring.resmat.dtos.TypeMaterielRequest;
import sio.spring.resmat.entities.TypeMateriel;
import sio.spring.resmat.services.CategorieService;
import sio.spring.resmat.services.NavigationService;
import sio.spring.resmat.services.TypeMaterielService;

@Controller
@RequestMapping("/types-materiel")
public class TypeMaterielController {
	private final TypeMaterielService typeMaterielService;
	private final CategorieService categorieService;
	private final NavigationService navigationService;

	TypeMaterielController(TypeMaterielService typeMaterielService, CategorieService categorieService,
			NavigationService navigationService) {
		this.typeMaterielService = typeMaterielService;
		this.categorieService = categorieService;
		this.navigationService = navigationService;
	}

	@GetMapping
	public String index(ModelMap model) {
		model.put("typesMateriel", typeMaterielService.findAll());
		model.put("liensNavigation", navigationService.liensPour("types-materiel", "/"));
		model.put("titrePage", navigationService.getTitrePage("types-materiel"));
		return "/types-materiel/index";
	}

	@GetMapping("/nouveau")
	public String add(ModelMap model) {
		model.put("edition", false);
		model.put("typeMateriel", new TypeMateriel());
		model.put("categories", categorieService.findAll());
		return "/types-materiel/form";
	}

	@PostMapping
	public RedirectView submitAdd(@ModelAttribute TypeMaterielRequest request) {
		return new RedirectView("/types-materiel");
	}

}
