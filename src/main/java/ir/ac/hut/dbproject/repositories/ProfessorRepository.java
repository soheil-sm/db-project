package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends CrudRepository<Professor, Long> {

    @Query(value = "SELECT * FROM professors WHERE username = :username" ,
            nativeQuery = true
    )
    Professor findByUsername(String username);

}
