package com.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.payment.service.PaymentGatewaySelector;
import com.payment.service.RazorpayGateway;

@Configuration
public class PaymentConfig {


//    @Bean
//    PaymentGatewaySelector paymentGatewaySelector() {
//		return new PaymentGatewaySelector(RazorpayGateway);
//	}
}
