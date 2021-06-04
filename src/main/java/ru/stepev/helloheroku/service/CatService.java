package ru.stepev.helloheroku.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import ru.stepev.helloheroku.model.Cat;
import ru.stepev.helloheroku.repository.CatRepository;

@Service
@AllArgsConstructor
public class CatService {

	private CatRepository catRepository;

	public List<Cat> getAll() {
		return catRepository.findAll();
	}

	public void add(Cat cat) {
		catRepository.saveAndFlush(cat);
	}

	public void update(Cat cat) {
		catRepository.saveAndFlush(cat);
	}

	public Optional<Cat> getById(int id) {
		return catRepository.findById(id);
	}

	public void delete(Cat cat) {
		catRepository.delete(cat);
	}
}
