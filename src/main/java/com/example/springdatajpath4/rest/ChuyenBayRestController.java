package com.example.springdatajpath4.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpath4.entity.ChuyenBay;
import com.example.springdatajpath4.service.ChuyenBayService;

@RestController
@RequestMapping("/api")
public class ChuyenBayRestController {
	@Autowired
	private ChuyenBayService cbService;
	
	@GetMapping("/chuyenbays/{ga}")
	public List<ChuyenBay> findAllDLA(@PathVariable String ga) throws Exception{
		
		return cbService.findAllByGaDen(ga);
	}
}
