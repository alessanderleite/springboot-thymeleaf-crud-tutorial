package br.com.alessanderleite.add.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.alessanderleite.add.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	List<Student> findByName(String name);
}
