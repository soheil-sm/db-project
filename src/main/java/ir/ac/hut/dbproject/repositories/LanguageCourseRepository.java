package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.LanguageCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface LanguageCourseRepository extends CrudRepository<LanguageCourse, Long> {
}
