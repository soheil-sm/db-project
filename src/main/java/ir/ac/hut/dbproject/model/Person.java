package ir.ac.hut.dbproject.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.*;
import lombok.experimental.SuperBuilder;

@MappedSuperclass
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString(callSuper = true)
public class Person extends BaseEntity {
    @Column(name = "firstname")
    private String fistName;
    @Column(name = "lastname")
    private String lastName;
}
