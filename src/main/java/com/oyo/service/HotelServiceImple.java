package com.oyo.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.oyo.model.Hotel;
import com.oyo.repo.HotelRepo;
@Service
public class HotelServiceImple  {
	
	@Autowired
	private HotelRepo repo;
	

	
	
	
	/*public void setHotelRepo(HotelRepo repo) {
		this.repo=repo;
	}*/

	@Transactional
	public Hotel addHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return repo.save(hotel);
	}

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)
	public List <Hotel> findAll() {
		return repo.findAll();
		 
		 }
	
	@Transactional
	public Hotel updateHotel(Hotel hotel) {
		// TODO Auto-generated method stub
		return repo.save(hotel);
	}

	@Transactional
	//@JsonManagedReference
	public Hotel getHotel(Integer hotelId) {
		// TODO Auto-generated method stub
		System.out.println("Hotel deta:"+repo.getOne(hotelId));
		return repo.getOne(hotelId);
	}

	@Transactional
	//@JsonManagedReference
	public Iterable<Hotel> listAllHotels() {
		// TODO Auto-generated method stub
		System.out.println("All hotels are:"+repo.findAll());
		return repo.findAll();
	}

	@Transactional
	public String deleteHotel(Integer hotelId) {
		repo.deleteById(hotelId);
		return "Successfully deleted hotel for id="+ hotelId;

	}
	@Transactional
	public int deleHotelEmailEmpty() {
		return repo.deleHotelEmailEmpty();
	}

}
