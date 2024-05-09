package com.payment.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.payment.service.PaymentService;


@RestController
public class paymentController {

	private PaymentService paymentService;
	
	public paymentController( PaymentService paymentService) {
			this.paymentService=paymentService;
	}
	
	@PostMapping("/payment")
	public String initialisePayment() {
		
		return paymentService.generatePaymentLink();
	}
	
	
}
