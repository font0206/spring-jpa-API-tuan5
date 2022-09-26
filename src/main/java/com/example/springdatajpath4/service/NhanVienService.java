package com.example.springdatajpath4.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springdatajpath4.entity.NhanVien;

@Service
public interface NhanVienService {
	public List<NhanVien> findNVLuongNhoHon10000();
	public int totalLuong();
	public List<String> phiCongLaiBoeing(String ma);
	public List<NhanVien> phiCongMayBay747(String mb);
	public List<String> phiCongLai2MB(String mb1, String mb2);
	public List<String> findNameByMB(String loai);
}
