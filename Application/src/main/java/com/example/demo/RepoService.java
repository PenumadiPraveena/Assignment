package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RepoService {
	@Autowired
	SaveInfo saveInfo;
	@PostMapping("/submitForm")
	public String SubmitForm(@ModelAttribute Details details) {
		
		if(details.getName().trim()!="" && Integer.parseInt(details.getAge())>=0 && details.getEmail().endsWith("gmail.com") && details.getEmail()!="" && details.getDob()!="")
		      saveInfo.save(details);

		return "redirect:/sample.html";
	}

}
