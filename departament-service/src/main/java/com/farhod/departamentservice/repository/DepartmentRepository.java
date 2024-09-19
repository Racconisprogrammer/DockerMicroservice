package com.farhod.departamentservice.repository;

import com.farhod.departamentservice.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
