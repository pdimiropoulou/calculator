package com.mycompany.calculator.controllers;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.calculator.models.Numeric;

@RestController
@RequestMapping("/api")
public class CalculatorController {
	
	@PostMapping("/add")
	public @ResponseBody Numeric add(@Valid @RequestBody Numeric obj){
		
		if (obj!=null) {
			obj.setResult(obj.getNumberA() + obj.getNumberB());
		}else {
			obj.setResult(0);
		}
		
		return obj;
		
	}
	@PostMapping("/substract")
	public @ResponseBody Numeric substract(@Valid @RequestBody Numeric obj){
		
		if (obj!=null) {
			obj.setResult(obj.getNumberA() - obj.getNumberB());
		}else {
			obj.setResult(0);
		}
		
		return obj;
		
	}
	@PostMapping("/multiply")
	public @ResponseBody Numeric multiply(@Valid @RequestBody Numeric obj){
		
		if (obj!=null) {
			obj.setResult(obj.getNumberA() *  obj.getNumberB());
		}else {
			obj.setResult(0);
		}
		
		return obj;
		
	}

}
