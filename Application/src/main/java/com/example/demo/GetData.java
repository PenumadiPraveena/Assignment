package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetData {
	
	@Autowired
	SaveInfo saveInfo;
	@GetMapping("users")
    public List<Details> users() 
	{
        return saveInfo.findAll();
	}

}
