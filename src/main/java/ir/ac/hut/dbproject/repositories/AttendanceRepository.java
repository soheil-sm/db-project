package ir.ac.hut.dbproject.repositories;

import ir.ac.hut.dbproject.model.Attendance;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public interface AttendanceRepository extends CrudRepository<Attendance, Long> {
}
