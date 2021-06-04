package ru.stepev.helloheroku.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ru.stepev.helloheroku.model.Cat;

@Repository
public interface CatRepository extends JpaRepository<Cat, Integer>{

}
