package com.payment.service;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.payment.utils.UtilsService;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Service
public class RazorpayGateway implements PaymentGateway {

	
	UtilsService utilsService =new UtilsService();
	
	private PaymentLink payment;

	@Override
	public String generatedPaymentLink() {
		
		
		PaymentLink payment = null ;
		RazorpayClient razorpay = null;
		try {
			razorpay = new RazorpayClient("rzp_test_dzwclcIVJX8qmk", "pj0BxskjHKd8pNvQmeHN4YY8");
		} catch (RazorpayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		JSONObject paymentLinkRequest = new JSONObject();
		paymentLinkRequest.put("amount",utilsService.generateRandomAmount()*100);
		paymentLinkRequest.put("currency","INR");
		paymentLinkRequest.put("accept_partial",false);
		//paymentLinkRequest.put("first_min_partial_amount",100);
		paymentLinkRequest.put("expire_by",1715353049); // Epoc time stam
		paymentLinkRequest.put("reference_id",utilsService.randomReferenceNumber().toString());
		paymentLinkRequest.put("description","Payment for policy no #23456");
		
		JSONObject customer = new JSONObject();
		customer.put("name","+918421114777");
		customer.put("contact","Nirbhay yeole");
		customer.put("email","nyeole@example.com");
		paymentLinkRequest.put("customer",customer);
		
		JSONObject notify = new JSONObject();
		notify.put("sms",true);
		notify.put("email",true);
		paymentLinkRequest.put("notify",notify);
		paymentLinkRequest.put("reminder_enable",true);
		
		JSONObject notes = new JSONObject();
//		notes.put("policy_name","Jeevan Bima");
//		paymentLinkRequest.put("notes",notes);
		paymentLinkRequest.put("callback_url","https://google.com/");
		paymentLinkRequest.put("callback_method","get");
		              
		try {
			 payment = razorpay.paymentLink.create(paymentLinkRequest);
		} catch (RazorpayException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return payment.toString();
	}

}
