package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Professor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProfessorRepository extends CrudRepository<Professor, Long> {
}
