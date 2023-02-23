package com.example.demo.Controller;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.demo.Entity.Employee;
	import com.example.demo.Service.EmployeeService;

	@RestController
	public class EmployeeController {
		
		@Autowired
		private EmployeeService empService;
		
		@PostMapping("/addEmployee")
		public String saveEmployee(@RequestBody Employee employee) {
		   empService.saveEmployee(employee);
		   return "Value Added";
		}
		@GetMapping("/getEmployee")
		public List<Employee> getAllEmployees(){
			return empService.getAllEmployees();
		}

		@GetMapping("/{id}")
		public Employee getEmployeeById(@PathVariable int id) {
			return empService.getEmployeeById(id);
			
		}


}