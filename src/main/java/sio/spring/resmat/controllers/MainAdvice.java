package sio.spring.resmat.controllers;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class MainAdvice {

	@ModelAttribute("nomApplication")
	public String getNomApplication() {
		return "ResMat";
	}
}
