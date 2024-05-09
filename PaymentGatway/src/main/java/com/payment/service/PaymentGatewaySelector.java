package com.payment.service;

import org.springframework.stereotype.Component;

@Component
public class PaymentGatewaySelector {

	
	private RazorpayGateway razorpayGateway;
	private StripeGateway stripeGateway;
	
	public PaymentGatewaySelector(RazorpayGateway razorpayGateway,
			StripeGateway stripeGateway) {
		
		this.razorpayGateway=razorpayGateway;
		this.stripeGateway=stripeGateway;
	}
	
	public  PaymentGateway  getPaymentGateways() {
		// logic for select payment gateway based on charges
		
		return razorpayGateway;
		
	}
}
