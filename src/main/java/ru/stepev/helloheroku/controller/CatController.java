package ru.stepev.helloheroku.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import ru.stepev.helloheroku.model.Cat;
import ru.stepev.helloheroku.service.CatService;

@Controller
@RequestMapping("/cats")
public class CatController {
	
	private CatService catService;

	public CatController(CatService catService) {
		this.catService = catService;
	}

	@GetMapping
	public String showAllCats(Model model) {
		List<Cat> cats = catService.getAll();
		model.addAttribute("cats", cats);
		return "cats-page";
	}

}
