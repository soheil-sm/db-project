package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Attendance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
}
