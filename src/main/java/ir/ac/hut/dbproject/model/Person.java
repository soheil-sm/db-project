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
    @Column(name = "first_name")
    private String fistName;
    @Column(name = "last_name")
    private String lastName;
}
