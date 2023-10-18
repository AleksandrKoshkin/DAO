package org.example.person;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "persons")
public class Person  {
    @EmbeddedId
    private PersonKey personKey;
    @Column(name = "phone_number", nullable = false)
    private int phone_number;
    @Column(name = "city_of_living", nullable = false)
    private String city_of_living;
}
