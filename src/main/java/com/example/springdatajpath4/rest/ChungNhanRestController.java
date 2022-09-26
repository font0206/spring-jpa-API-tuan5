package com.example.springdatajpath4.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springdatajpath4.entity.ChungNhan;
import com.example.springdatajpath4.service.ChungNhanService;

@RestController
@RequestMapping("/api")
public class ChungNhanRestController {
	
	@Autowired
	private ChungNhanService chungNhanService;
	
	@GetMapping("/chungnhans/ma-mb-nv-ho-nguyen")
	public List<String> maMBVoiNVHoNguyen(){
		List<String> ls = chungNhanService.maMBVoiNVHoNguyen("Nguyễn");
		
		return ls;
	}
	@GetMapping("/chungnhans")
	public List<ChungNhan> findAll(){
		List<ChungNhan> ls = chungNhanService.findAll();
		
		return ls;
	}
}
