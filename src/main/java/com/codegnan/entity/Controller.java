package com.codegnan.entity;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codegnan.repo.FormRepo;
@CrossOrigin("*")
@RestController
@RequestMapping("/form")
public class Controller {
	@Autowired
	FormRepo fr;
	@PostMapping("/add")
	public String setForm(@RequestBody Form form) {
		fr.save(form);
		return "done";
	}
	
	@GetMapping
	public List<Form>  getForm() {
		return fr.findAll();
	}
}
