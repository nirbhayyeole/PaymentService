package com.payment.service;

import org.springframework.stereotype.Service;

@Service
public class PaymentService  {

	private PaymentGatewaySelector paymentGatewaySelector;
	
	public PaymentService(PaymentGatewaySelector paymentGatewaySelector) {
		this.paymentGatewaySelector = paymentGatewaySelector;
	}
	
	
	public String generatePaymentLink() {
		// logic to add details into db
		
		
		return paymentGatewaySelector
				.getPaymentGateways()
				.generatedPaymentLink();
	}
	
}
