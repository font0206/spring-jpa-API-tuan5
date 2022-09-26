package com.example.springdatajpath4.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpath4.entity.ChungNhan;
import com.example.springdatajpath4.repository.ChungNhanRepository;

import lombok.AllArgsConstructor;
@Service
@Transactional
public class ChungNhanServiceImpl implements ChungNhanService {
	@Autowired
	private ChungNhanRepository chungNhanRepository;
//	@Autowired
//	public ChungNhanServiceImpl(ChungNhanRepository rp) {
//		chungNhanRepository = rp;
//	}
	


	@Override
	public List<String> maMBVoiNVHoNguyen(String name) {
		
		return chungNhanRepository.maMBVoiNVHoNguyen("Nguyễn");
	}

	@Override
	public List<ChungNhan> findAll() {
		return chungNhanRepository.findAll();
	}
	

}
