package ir.ac.hut.dbproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
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

    private int grade;

    public Student(String userName, String password, Set<LanguageCourse> courses, int grade) {
        super(userName, password, UserType.STUDENT);
        this.courses = courses;
        this.grade = grade;
    }

}
