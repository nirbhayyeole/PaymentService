package com.payment.service;

import org.springframework.stereotype.Service;

@Service
public class StripeGateway  implements PaymentGateway{

	@Override
	public String generatedPaymentLink() {
		
		
		return "";
	}

}

