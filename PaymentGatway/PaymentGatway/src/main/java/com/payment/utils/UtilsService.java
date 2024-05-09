package com.payment.utils;

import java.util.Date;
import java.util.Random;

public class UtilsService {
	
	
	public static String randomReferenceNumber() {
		
		
		 Date currentDate = new Date();
	        
	        // Generate random number
	        Random random = new Random();
	        int randomNumber = random.nextInt(10000); // Change 10000 to the desired range
	        
	        // Combine current date and random number
	        String randomNumberWithDate = String.format("%tY%tm%td%04d", currentDate, currentDate, currentDate, randomNumber);
	        
	        return randomNumberWithDate;
		
	}
	public static int generateRandomAmount() {
		 Random random = new Random();
	        int randomNumber = random.nextInt(10000);
	        return randomNumber;
		
	}

}
