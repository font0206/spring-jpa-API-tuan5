package com.example.springdatajpath4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springdatajpath4.entity.MayBay;

@Service
public interface MayBayService {
	public List<MayBay> findMayBayLon(int tambay);
	public int countLoaiBoeing();
	public List<MayBay> findMayBayByCB(String maCB);
	public List<Object> findMayBayDuocLai();
}
