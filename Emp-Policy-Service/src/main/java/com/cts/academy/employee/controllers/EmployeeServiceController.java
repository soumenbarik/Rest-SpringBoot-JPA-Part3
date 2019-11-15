package com.cts.academy.employee.controllers;

import com.cts.academy.employee.model.Employee;
import com.cts.academy.employee.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseStatus;

@RestController
@RequestMapping(value = "v1/employee/{employeeId}")
public class EmployeeServiceController {

	@Autowired
	private EmployeeService empService;

	@GetMapping(value = "")
	public Employee getEmployee(@PathVariable("employeeId") String employeeId) {

		return empService.getEmployee(employeeId);
	}

	@RequestMapping(value = "/policyId/{policyId}", method = RequestMethod.GET)
	public Employee getEmployeePolicyDetail(@PathVariable("employeeId") String employeeId,

			@PathVariable("policyId") String policyId) throws InterruptedException {

		return empService.fetchEmployee(employeeId, policyId);
	}

	@RequestMapping(value = "", method = RequestMethod.PUT)
	public void updateLicenses(@PathVariable("employeeId") String employeeId, @RequestBody Employee employee) {
		empService.updateEmployee(employee);
	}

	@RequestMapping(value = "", method = RequestMethod.POST)
	public void saveLicenses(@RequestBody Employee employee) {
		empService.saveEmployeeDetails(employee);
	}

	@RequestMapping(value = "", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteEmployee(@PathVariable("employeeId") String employeeId) {
		empService.deleteLEmployee(employeeId);
	}

}
