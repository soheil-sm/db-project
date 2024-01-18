package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Admin;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AdminRepository extends CrudRepository<Admin, Long> {
}
