package com.mouritech.microservices.departmentmanagement.service;

import java.util.List;

import com.mouritech.microservices.departmentmanagement.domain.Department;



public interface DepartmentService {
	
	void addDepartment(Department dept);
	List<Department> getDepartments();

}
