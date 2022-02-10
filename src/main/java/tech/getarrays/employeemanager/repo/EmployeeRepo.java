package tech.getarrays.employeemanager.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.getarrays.employeemanager.model.Employee;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    // Spring will generate those methods itself basing on the name of the method   (query methods on Spring)
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}



// extends JpaRepository : gives us to mush the CRUD methods