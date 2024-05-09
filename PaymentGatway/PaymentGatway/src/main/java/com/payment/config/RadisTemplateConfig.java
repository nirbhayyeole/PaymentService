package com.payment.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;

import com.payment.service.PaymentGatewaySelector;
import com.payment.service.RazorpayGateway;
import com.payment.utils.UtilsService;

@Configuration
public class RadisTemplateConfig {


//    @Bean
//    PaymentGatewaySelector paymentGatewaySelector() {
//		return new PaymentGatewaySelector(RazorpayGateway);
//	}
	
	
//	@Bean
//	 RedisTemplate<String,Object> radisTemplate(
//			RedisConnectionFactory redisConnectionFactory){
//				return null;
//		
//	}
	
//	@Bean
//	UtilsService utilsService() {
//		return utilsService();
//	}
	
}
