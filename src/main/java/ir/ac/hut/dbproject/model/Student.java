package ir.ac.hut.dbproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.util.Set;

@Entity
@Table(name = "students")
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
public class Student extends User {
    @ManyToMany(mappedBy = "students")
    private Set<LanguageCourse> courses;

    public Student(String userName, String password, Set<LanguageCourse> courses, int grade) {
        super(userName, password, UserType.STUDENT);
        this.courses = courses;
    }

}
