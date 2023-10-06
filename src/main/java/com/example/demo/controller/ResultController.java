package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Result;
import com.example.demo.repository.ResultRepository;

@RestController
@RequestMapping("/result-service")
public class ResultController {

	@Autowired
	private ResultRepository resultRepository;
	
	@PostMapping
	public ResponseEntity<String> saveResult(@RequestBody Result result){
		Result saveResult = resultRepository.save(result);
		return new ResponseEntity<>("Result of student with ID "+saveResult.getStudentId()+ " saved successfully ", HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<List<Result>> getResults(){
		List<Result> results = resultRepository.findAll();
		return new ResponseEntity<>(results, HttpStatus.CREATED);
		
	}
}
