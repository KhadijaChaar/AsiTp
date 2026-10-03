package tn.esprit.autoloccce17.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@Entity
public class Agence {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;
    private String adresse;
    private String nom;
    private String ville;
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Vehicule> vehicules;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agence")
    private Set<Employee> employees;
}