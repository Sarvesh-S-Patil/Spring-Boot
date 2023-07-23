package com.Sarvesh.HibernateSB.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Sarvesh.HibernateSB.Models.CreateEmployeeRequest;
import com.Sarvesh.HibernateSB.Models.CreateEmployeeResponse;
import com.Sarvesh.HibernateSB.Models.DeleteEmployeeResponse;
import com.Sarvesh.HibernateSB.Service.EmployeeService;
import com.Sarvesh.HibernateSB.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeService employeeService;
	@RequestMapping("/test")
	public String testAPI() {
		return "Test API Works";
	}
	@RequestMapping("/addEmployee")
	public CreateEmployeeResponse createEmployee(@RequestBody CreateEmployeeRequest employee) {
		return employeeService.createEmployee(employee);
	}
	
	@RequestMapping("/deleteEmployee")
	public DeleteEmployeeResponse delete(@RequestParam int id) {
		return employeeService.delete(id);
	}
	
	@GetMapping("/getAllEmployees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("/getEmployeeById")
	private Employee getEmployeeById(@RequestParam int employeeId) {
		return employeeService.getEmployeeById(employeeId);
	}
	
}
