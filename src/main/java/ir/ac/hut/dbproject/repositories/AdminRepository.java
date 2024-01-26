package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Admin;
import ir.ac.hut.dbproject.model.Professor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {

    @Query(value = "SELECT * FROM admins WHERE username = :username" ,
            nativeQuery = true
    )
    Professor findByUsername(String username);
}
