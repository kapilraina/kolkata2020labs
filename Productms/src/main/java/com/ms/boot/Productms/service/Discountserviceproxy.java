package com.ms.boot.Productms.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ms.boot.Productms.model.DiscountRequest;
import com.ms.boot.Productms.model.DiscountResponse;

@Component
@FeignClient(name = "discountms", fallback = DiscountServiceFallback.class)
public interface Discountserviceproxy {
	
	@RequestMapping(value = "/caldisc", method = RequestMethod.POST)
	public DiscountResponse calculateDiscount(DiscountRequest dRequest);

}
