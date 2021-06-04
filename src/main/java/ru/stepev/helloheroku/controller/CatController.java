package ru.stepev.helloheroku.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/{id}")
	public String getCat(@PathVariable int id, Model model) {
		Cat cat = catService.getById(id).orElseThrow();
		model.addAttribute("cat", cat);
		return "show-classroom";
	}
	
	@GetMapping("/add")
	public String addCat(Model model) {
		Cat cat = new Cat();
		model.addAttribute("cat", cat);
		return "add-cat";
	}
	
	@PostMapping("/create")
	public String createCat(@ModelAttribute Cat cat, Model model) {
		catService.add(cat);
		return "redirect:/cats";
	}
	
	@GetMapping("/update/{id}")
	public String updateCat(@PathVariable int id, Model model) {
		Cat cat = catService.getById(id).orElseThrow();
		model.addAttribute("cat", cat);
		return "update-cat";
	}
	
	@PostMapping("/save")
	public String saveCat(@ModelAttribute Cat cat, Model model) {
		catService.update(cat);
		return "redirect:/cats";
	}

	@GetMapping("/delete/{id}")
	public String deleteCat(@PathVariable int id, Model model) {
		Cat cat = catService.getById(id).orElseThrow();
		catService.delete(cat);
		return "redirect:/cats";
	}
}
