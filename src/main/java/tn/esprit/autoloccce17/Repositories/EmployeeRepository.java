package tn.esprit.autoloccce17.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoloccce17.domain.Employee;
@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {
}
