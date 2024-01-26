package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Professor;
import ir.ac.hut.dbproject.model.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
    @Query(value = "SELECT * FROM sutdents WHERE username = :username" ,
            nativeQuery = true
    )
    Student findByUsername(String username);
}
