package ir.ac.hut.dbproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class StudentCourseKey implements Serializable {

    @Column(name = "student_id")
    private Long studentId;
    @Column(name = "course_id")
    private Long courseId;

    @Override
    public boolean equals(Object o) {

            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            StudentCourseKey that = (StudentCourseKey) o;

            if (!studentId.equals(that.studentId)) return false;
            return courseId.equals(that.courseId);
    }

    @Override
    public int hashCode() {
        int result = studentId.hashCode();
        result = 31 * result + courseId.hashCode();
        return result;
    }
}
