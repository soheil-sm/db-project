package ir.ac.hut.dbproject.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.Set;


@Entity
@Table(name = "professors")
@NoArgsConstructor
@SuperBuilder
@Setter
@Getter
@ToString(callSuper = true)
public class Professor extends User {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "professor", fetch = FetchType.EAGER)
    private Set<LanguageCourse> courses;

    public Professor(String userName, String password, Set<LanguageCourse> courses) {
        super(userName, password, UserType.PROFESSOR);
        this.courses = courses;
    }


}
