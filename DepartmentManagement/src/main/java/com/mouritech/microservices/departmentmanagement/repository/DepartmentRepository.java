package com.mouritech.microservices.departmentmanagement.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mouritech.microservices.departmentmanagement.domain.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long>{

	
}
