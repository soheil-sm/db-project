package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public interface UserRepository extends CrudRepository<User, Long> {
}
