package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.LanguageCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageCourseRepository extends CrudRepository<LanguageCourse, Long> {
}
