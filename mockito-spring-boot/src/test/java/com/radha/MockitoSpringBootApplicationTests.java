package com.radha;

import com.radha.core.Employee;
import com.radha.repository.EmployeeRepository;
import com.radha.service.EmployeeService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MockitoSpringBootApplicationTests {

	@InjectMocks
	private EmployeeService employeeService;

	@Mock
	private EmployeeRepository employeeRepository;

	@Test
	public void testSave(){
		Employee employee = new Employee();
		employee.setEmpId(2);
		employee.setFirstName("Radha");
		employee.setLastName("Singh");
		when(employeeService.save(employee)).thenReturn(employee);
		assertNotNull(employeeService.save(employee));
		assertEquals(2,employee.getEmpId());
	}

	@Test
	public void testGetById(){
		Employee employee = new Employee();
		employee.setEmpId(1);
		employee.setFirstName("Adarsh");
		employee.setLastName("Singh");
		when(employeeService.getById(1)).thenReturn(java.util.Optional.of(employee));
		assertNotNull(employeeService.getById(1));
		assertEquals("Adarsh",employee.getFirstName());
	}



}
