package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.StudentCourse;
import ir.ac.hut.dbproject.model.StudentCourseKey;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface StudentCourseRepository extends CrudRepository<StudentCourse, Long> {
}
