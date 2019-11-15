package com.cts.academy.employee.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.cts.academy.employee.model.Policy;

@FeignClient(name = "policyService")
public interface PolicyRestClient {

	@RequestMapping(method = RequestMethod.GET, value = "/policy/{policyId}")
	public Policy getPolicyDetils(@PathVariable("policyId") String policyID);
}
