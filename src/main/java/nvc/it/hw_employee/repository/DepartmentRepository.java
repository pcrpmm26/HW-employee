package nvc.it.hw_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.hw_employee.model.Department;

public interface DepartmentRepository extends JpaRepository<Department, Integer> {
    
}
