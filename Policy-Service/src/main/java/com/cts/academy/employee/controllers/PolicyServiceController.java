package com.cts.academy.employee.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cts.academy.employee.model.Policy;
import com.cts.academy.employee.services.PolicyService;

@RestController
@RequestMapping(value = "v1/policyId/{policyId}")
public class PolicyServiceController {

	@Autowired
	private PolicyService policyService;
	
	@GetMapping(value = "")
	public Policy getEmployee(@PathVariable("policyId") String policyId) throws InterruptedException {

		return policyService.fetchPolicy(policyId);
	}
}
