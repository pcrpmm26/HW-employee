package nvc.it.hw_employee.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.hw_employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    public List<Employee> findByNameContaining(String name);
    
    public List<Employee> findBySalaryGreaterThanEqual(Double salary);
}
