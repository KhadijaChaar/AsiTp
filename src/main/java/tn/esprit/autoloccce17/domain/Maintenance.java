package tn.esprit.autoloccce17.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Maintenance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    private String description;
    private LocalDate dateDebut;
    private LocalDate dateFin;

    @ManyToOne(cascade = CascadeType.ALL)
    private Vehicule vehicule;
}
