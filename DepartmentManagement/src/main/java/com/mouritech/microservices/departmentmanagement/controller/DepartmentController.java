package com.mouritech.microservices.departmentmanagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mouritech.microservices.departmentmanagement.domain.Department;
import com.mouritech.microservices.departmentmanagement.service.DepartmentService;


@RestController
@RequestMapping(value = "/")
public class DepartmentController {
	
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping
	public void addDepartment(@RequestBody Department dept) {
		departmentService.addDepartment(dept);
	}
	
	@GetMapping
	public List<Department> getDepartments() {

		return departmentService.getDepartments();
	}
}
