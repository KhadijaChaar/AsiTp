package tn.esprit.autoloccce17.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloccce17.domain.Agence;
@Repository
public interface AgenceRepository extends JpaRepository<Agence,Long> {
}
