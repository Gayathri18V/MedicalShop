package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.login;
import com.example.demo.repo.LoginRepo;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class LoginController {
	
	@Autowired
	private LoginRepo repo1;
	@PostMapping("/login")
	
	public ResponseEntity<login> registerUser(@RequestBody login user)
	{
	  	System.out.println("Controller called");
		return ResponseEntity.ok(repo1.save(user));
		
	}
}

