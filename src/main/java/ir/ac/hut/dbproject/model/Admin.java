package ir.ac.hut.dbproject.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "admins")
@SuperBuilder
@NoArgsConstructor
@Setter
@Getter
public class Admin extends User {

    public Admin(String userName, String password) {
        super(userName, password, UserType.ADMIN);
    }
}
