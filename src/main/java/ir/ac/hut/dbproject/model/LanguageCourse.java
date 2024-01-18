package ir.ac.hut.dbproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "courses")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class LanguageCourse extends BaseEntity {

    private Language language;
    @ManyToMany
    @JoinTable(name = "student_course", joinColumns = @JoinColumn(name = "course_id"),
            inverseJoinColumns = @JoinColumn(name = "student_id"))
    private Set<Student> students;
    @ManyToOne
    @JoinColumn(name = "professor_id", nullable = false)
    private Professor professor;
    private Date startDate;
    private Date endDate;
}
