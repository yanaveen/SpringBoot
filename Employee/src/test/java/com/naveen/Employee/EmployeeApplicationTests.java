package com.naveen.Employee;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.naveen.Employee.entity.Employee;
import com.naveen.Employee.repository.EmployeeRepository;

@SpringBootTest
class EmployeeApplicationTests {
	
	@Autowired
	EmployeeRepository empRepo;
	
	@Test
	public void testCreate () {
		Employee e = new Employee();
		e.setId(7);
		e.setName("Sony head phone");
		e.setSalary(200);
		e.setGender("male");
		e.setAge(23);
		e.setDept_id(102);
		empRepo.save(e);
		assertNotNull(empRepo.findById(1L).getId());
	}

}
