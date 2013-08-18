package com.fmall.springmvc.service;

import java.util.List;

import com.travelzen.hotel.gta.entity.Hotel;

public interface IDemoService {
	void saveHotel(Hotel hotel);
	List<Hotel> getHotel();

}
