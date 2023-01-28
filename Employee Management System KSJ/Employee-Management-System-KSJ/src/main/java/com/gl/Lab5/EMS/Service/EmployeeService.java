package com.gl.Lab5.EMS.Service;

import java.util.List;

import com.gl.Lab5.EMS.Entity.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployees();

	void saveEmployee(Employee employee);

	Employee getEmployeeById(long id);

	void deleteEmployeeById(long id);
}
