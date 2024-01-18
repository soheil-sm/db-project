package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentRepository extends CrudRepository<Student, Long> {
}
