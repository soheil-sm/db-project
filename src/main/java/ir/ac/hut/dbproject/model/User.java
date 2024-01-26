package ir.ac.hut.dbproject.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.JOINED)
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString(callSuper = true)
public class User extends Person {
    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "usertype")
    @Enumerated(EnumType.STRING)
    private UserType userType;

}
