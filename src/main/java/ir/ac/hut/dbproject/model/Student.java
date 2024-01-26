package ir.ac.hut.dbproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.List;
import java.util.Set;

@Entity
@Table(name = "students")
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class Student extends User {
    @OneToMany(mappedBy = "student")
    Set<StudentCourse> studentCourses;

    public Student(String username, String password, Set<StudentCourse> studentCourses) {
        super(username, password, UserType.STUDENT);
        this.studentCourses = studentCourses;
    }

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "student", fetch = FetchType.EAGER)
    private List<Attendance> attendances;

}
