package com.example.springdatajpath4.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.springdatajpath4.entity.ChungNhan;

import lombok.AllArgsConstructor;

@Service
public interface ChungNhanService {
	List<String> maMBVoiNVHoNguyen(String name);

	List<ChungNhan> findAll();
}
