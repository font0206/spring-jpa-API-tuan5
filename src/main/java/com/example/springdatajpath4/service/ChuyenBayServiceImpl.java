package com.example.springdatajpath4.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springdatajpath4.entity.ChuyenBay;
import com.example.springdatajpath4.repository.ChuyenBayRepository;
@Service
@Transactional
public class ChuyenBayServiceImpl implements ChuyenBayService {
	@Autowired
	private ChuyenBayRepository chuyenBayRepository;
	@Override
	public List<ChuyenBay> findAllByGaDen(String gaDen) {
		
		return chuyenBayRepository.findAllByGaDen(gaDen);
	}

	@Override
	public List<ChuyenBay> chuyenBaySaiGonMeThuoc(String from, String to) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int chuyenBayTuSaiGon() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ChuyenBay> chuyenBayCuaAirbusA320() {
		// TODO Auto-generated method stub
		return null;
	}

}
