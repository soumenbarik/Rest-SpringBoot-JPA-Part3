package com.cts.academy.employee.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.cts.academy.employee.model.Policy;

@Repository
public interface PolicyRepository extends CrudRepository<Policy, String> {
	public Policy findByPolicyId(String policyId);
}
