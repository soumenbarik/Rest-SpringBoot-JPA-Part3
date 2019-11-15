package com.cts.academy.employee.services;


import com.cts.academy.employee.model.Policy;
import com.cts.academy.employee.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

	@Autowired
	private PolicyRepository policyRepo;

	public Policy fetchPolicy(String policyId) throws InterruptedException {
		return  policyRepo.findByPolicyId(policyId);
	}
	
}
