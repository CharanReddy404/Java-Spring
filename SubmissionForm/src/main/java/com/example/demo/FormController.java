package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FormController {
	
	@GetMapping("/edureka")
	public String edureka() {
		return "edureka";
	}
	
	@PostMapping("/details")
	public String viewDetails(@RequestParam("cid") String cId,
			@RequestParam("cname") String cName,
			@RequestParam("cemail") String cEmail, 
			ModelMap modelMap) {
		System.out.println("hello");
		
		modelMap.put("cId", cId);
		modelMap.put("cName", cName);
		modelMap.put("cEmail", cEmail);
		
		return "ViewCustomers";
	}
	
}
