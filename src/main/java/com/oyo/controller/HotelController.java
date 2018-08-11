package com.oyo.controller; 

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.oyo.model.Hotel;
import com.oyo.repo.HotelRepo;
import com.oyo.service.HotelServiceImple;

/*@Controller*/
@RestController
@RequestMapping("/api")
public class HotelController {
	
	@Autowired
	private HotelServiceImple service;

	
	
	/*public void setHotelServiceImple(HotelServiceImple service) {
		this.service = service;
	}*/
	
	@PostMapping(consumes = "application/json", produces = "application/json")
	public Hotel addHotel(@RequestBody Hotel hotel) {

		System.out.println("obj=" + hotel.getHotelName());
		return service.addHotel(hotel);
	}
	@GetMapping("/{hotelId}")
	public Hotel getHotelById(@PathVariable("hotelId") Integer hotelId) {
		System.out.println("Hotelid=" + hotelId);
		return service.getHotel(hotelId);
		
	}
	
	@GetMapping
	public List<Hotel> findAll() {
		  return (List<Hotel>) service.listAllHotels();
		 }
	@PutMapping(consumes = "application/json",produces = "application/json")
	public Hotel updateHotel(@RequestBody Hotel hotel) {

		System.out.println("obj=" + hotel.getHotelName());
		return service.updateHotel(hotel);

	}
	
	
	
	@DeleteMapping("/{hotelId}")
	public String deleteHotelById(@PathVariable("hotelId") Integer hotelId) {
		return service.deleteHotel(hotelId);

	}



	@GetMapping(produces = "application/json")
	public List<Hotel> getAllHotels() {

		return service.findAll();
	}
	
	@DeleteMapping(produces = "application/json")
	public int deleHotelEmailEmpty() {

		return service.deleHotelEmailEmpty(); 
	}
	
	

}
