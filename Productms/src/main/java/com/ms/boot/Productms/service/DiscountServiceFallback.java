package com.ms.boot.Productms.service;

import com.ms.boot.Productms.model.DiscountRequest;
import com.ms.boot.Productms.model.DiscountResponse;

public class DiscountServiceFallback implements Discountserviceproxy {

	@Override
	public DiscountResponse calculateDiscount(DiscountRequest dRequest) {

		return new DiscountResponse(dRequest.getCategory(), dRequest.getMrp(), dRequest.getMrp(), 0.0, 0.0);
	}

}
