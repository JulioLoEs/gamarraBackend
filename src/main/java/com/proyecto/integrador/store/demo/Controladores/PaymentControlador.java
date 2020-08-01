package com.proyecto.integrador.store.demo.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.integrador.store.demo.paymentDTO.PaymentIntentDTO;
import com.proyecto.integrador.store.demo.services.Impl.PaymentService;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/stripe"})
public class PaymentControlador {
	
	@Autowired
	PaymentService pservice;
	
	
	@PostMapping("/paymentintent")
	public ResponseEntity<String> payment(@RequestBody PaymentIntentDTO pintentdto) throws StripeException{
		PaymentIntent pintent = pservice.pintent(pintentdto);
		String paymentStr = pintent.toJson();
		return new ResponseEntity<String>(paymentStr, HttpStatus.OK);		
	} 
	
	@PostMapping("/confirm/{id}")
	public ResponseEntity<String> confirm(@PathVariable("id") String id) throws StripeException{
		PaymentIntent pintent = pservice.confirm(id);
		String paymentStr = pintent.toJson();
		return new ResponseEntity<String>(paymentStr, HttpStatus.OK);		
	}
	
	@PostMapping("/cancel/{id}")
	public ResponseEntity<String> cancel(@PathVariable("id") String id) throws StripeException{
		PaymentIntent pintent = pservice.cancel(id);
		String paymentStr = pintent.toJson();
		return new ResponseEntity<String>(paymentStr, HttpStatus.OK);		
	} 

}
