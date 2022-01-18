package nvc.it.hw_employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import nvc.it.hw_employee.model.Project;

public interface ProjectRepository extends JpaRepository<Project, Integer> {
    
}
