package com.cts.academy.employee.services;

import com.cts.academy.employee.client.PolicyRestClient;
import com.cts.academy.employee.model.Employee;
import com.cts.academy.employee.model.Policy;
import com.cts.academy.employee.repository.EmployeeRepository;
/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Autowired
	private PolicyRestClient policyClient;

	public Employee fetchEmployee(String employeeId, String policyId) throws InterruptedException {
		Employee employee = employeeRepo.findByEmployeeId(employeeId);

		Policy polDetails = getPolicyDetails(policyId);

		return employee.withEnsurer(polDetails.getInsurerName()).withContactEmail(polDetails.getContactEmail())
				.withInsuranceStartDate(polDetails.getInsuranceStartDate())
				.withNosOfDependent(polDetails.getNosOfDependent()).withPolicyID(polDetails.getPolicyNumber());
	}

	private Policy getPolicyDetails(String policyId) {
		return policyClient.getPolicyDetils(policyId);
	}

	public Employee getEmployee(String employeeID) {

		return employeeRepo.findByEmployeeId(employeeID);
	}

	public void saveEmployeeDetails(Employee emp) {

		employeeRepo.save(emp);
	}

	public void updateEmployee(Employee emp) {
		employeeRepo.save(emp);
	}

	public void deleteLEmployee(String empID) {
		employeeRepo.deleteById(empID);
	}

}
