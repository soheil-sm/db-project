package ir.ac.hut.dbproject.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class User extends Person {
    @Column(name = "userName")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "user-type")
    @Enumerated(EnumType.STRING)
    private UserType userType;

}
