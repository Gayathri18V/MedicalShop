package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.Tablet;
import com.example.demo.repo.TabletRepo;

@RestController
@CrossOrigin(origins ="http://localhost:4200")
public class TabletController {
	
	@Autowired
	private TabletRepo repo2;
	@PostMapping("/tablet")
	
	public ResponseEntity<Tablet> registerUser(@RequestBody Tablet user)
	{
	  	System.out.println("Controller called");
		return ResponseEntity.ok(repo2.save(user));
		
	}
}

