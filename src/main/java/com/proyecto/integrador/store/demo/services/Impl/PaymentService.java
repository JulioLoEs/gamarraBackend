package com.proyecto.integrador.store.demo.services.Impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.proyecto.integrador.store.demo.paymentDTO.PaymentIntentDTO;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

@Service
public class PaymentService {

	@Value("$(sk_test_51Gza9oERXnqSfkA9WJ7FcY4qgTcmvrZO3LH9ht71N3AQrUxnPOZNj4OAJlqX1vZ4At4DHAjGv1yXw2fx9HFApHeE00nCupTVel)")
	String secretKey;
	
	public PaymentIntent pintent (PaymentIntentDTO pintentdto) throws StripeException {
		Stripe.apiKey = secretKey;
		Map<String, Object> params = new HashMap<>();
		params.put("amount", pintentdto.getAmount());
		params.put("currency", pintentdto.getCurrency());
		params.put("description", pintentdto.getDescription());
		ArrayList payment_method_types = new ArrayList<>();
		payment_method_types.add("card");
		params.put("payment_method_types", payment_method_types);
		return PaymentIntent.create(params);
	}
	
	public PaymentIntent confirm(String id) throws StripeException {
		Stripe.apiKey = secretKey;
		PaymentIntent pintent = PaymentIntent.retrieve(id);
		Map<String, Object>params = new HashMap<>();
		params.put("payment_method", "pm_card_visa");
		pintent.confirm(params);
		return pintent;
	}
	
	public PaymentIntent cancel(String id) throws StripeException {
		Stripe.apiKey = secretKey;
		PaymentIntent pintent = PaymentIntent.retrieve(id);		 
		pintent.cancel();
		return pintent;
	}
}
