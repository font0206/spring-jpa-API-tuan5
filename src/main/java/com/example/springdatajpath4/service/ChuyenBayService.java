package com.example.springdatajpath4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springdatajpath4.entity.ChuyenBay;
@Service
public interface ChuyenBayService {
	public List<ChuyenBay> findAllByGaDen(String gaDen);
	public List<ChuyenBay> chuyenBaySaiGonMeThuoc(String from, String to);
	public int chuyenBayTuSaiGon();
	public List<ChuyenBay> chuyenBayCuaAirbusA320 ();
}
