package tn.esprit.autoloccce17.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloccce17.domain.enumerations.RoleEmployee;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmlpoyee;
    private String nom;
    private String prenom;
    @Enumerated(EnumType.STRING)
    private RoleEmployee role;

    @ManyToOne
    private Agence agence;
}
