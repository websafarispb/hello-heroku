package ru.stepev.helloheroku.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.stepev.helloheroku.model.Cat;
import ru.stepev.helloheroku.repository.CatRepository;

@Service
//@AllArgsConstructor
public class CatService {
	
	private CatRepository catRepository;
	
	public CatService (CatRepository catRepository) {
		this.catRepository = catRepository;
	}
	
	public List<Cat> getAll() {
//		List<Cat> cats = new ArrayList<>();
//		cats.add(new Cat(1,"Vaka"));
//		cats.add(new Cat(2,"Baka"));
//		cats.add(new Cat(3,"Zuma"));
//		cats.add(new Cat(4,"Puma"));
//		cats.add(new Cat(5,"Oso"));
		return catRepository.findAll();
	}
	

	
}
