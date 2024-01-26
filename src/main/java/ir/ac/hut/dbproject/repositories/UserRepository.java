package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Professor;
import ir.ac.hut.dbproject.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    @Query(value = "SELECT * FROM users WHERE username = :username" ,
            nativeQuery = true
    )
    Professor findByUsername(String username);
}
