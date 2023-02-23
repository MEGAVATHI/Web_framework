package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.Employee;
import com.example.demo.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired   
	private EmployeeRepository empRepo;
	
	//TO POST - INSERT
	public Employee saveEmployee(Employee employee) {
		return empRepo.save(employee);
	}
	
	//TO GET - READ
	public List<Employee> getAllEmployees(){
		return empRepo.findAll();
	}
	
	public Employee getEmployeeById(int id){
		return empRepo.findById(id).orElse(null);
	}
	public void deleteEmployeeById(int id) {
		empRepo.deleteById(id);
	}	

}