package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.StudentCourse;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentCourseRepository extends CrudRepository<StudentCourse, Long> {
}
