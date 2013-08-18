package com.fmall.springmvc.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.fmall.springmvc.service.IDemoService;
import com.travelzen.hotel.gta.dao.IHotelBrandDao;
import com.travelzen.hotel.gta.dao.impl.DemoDaoImpl;
import com.travelzen.hotel.gta.entity.Hotel;
import com.travelzen.hotel.gta.entity.HotelBrand;
import com.travelzen.hotel.gta.entity.HotelBrandNotice;

@Service("demoService")
public class DemoServiceImpl implements IDemoService{

	@Resource
	private IHotelBrandDao hotelBrandDao;
	@Resource
	private DemoDaoImpl demoDao;
	
	@Override
	public void saveHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		HotelBrandNotice hbn = new HotelBrandNotice();
		hbn.setBrandNoticeName("setBrandNoticeName");
		HotelBrand hb = new HotelBrand();
		
		hb.setHotelBrandNotice(hbn);
		hotelBrandDao.create(hb);
		hotel.setHotelBrand(hb);
		demoDao.create(hotel);
	}

	@Override
	public List<Hotel> getHotel() {
		// TODO Auto-generated method stub
	   return null;
		
	}
	

}
