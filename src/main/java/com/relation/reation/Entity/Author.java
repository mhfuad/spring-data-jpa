package com.relation.reation.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@SuperBuilder
public class Author extends BaseEntity{

    private String firstName;
    private String lastName;
    private String email;
    private int age;
    // @Column(
    //     updatable = false,
    //     nullable = false
    // )
    // private LocalDateTime createAt;
    // @Column(
    //     insertable = false
    // )
    // private LocalDateTime lastModified;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
