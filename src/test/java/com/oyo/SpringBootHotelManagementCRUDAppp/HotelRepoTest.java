package com.oyo.SpringBootHotelManagementCRUDAppp;

import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.oyo.model.Hotel;
import com.oyo.repo.HotelRepo;

@RunWith(SpringRunner.class)
@DataJpaTest
public class HotelRepoTest {
	HotelRepo repository;
	
	@Test
	public void findByUsernameShouldReturnUser() {
		Hotel entity=new Hotel();
		entity.setHotelName("taj");
		entity.setHotelId(100);
		entity.setEmail("msk@gmail.com");
		entity.setAddr("Hulimavu");
		entity.setMobno(988);
		entity.setPinCode(560);
		this.repository.save(entity);
		Optional<Hotel> user=this.repository.findById(100);
		
		if (user.isPresent()) {
			System.out.println(user.get().getHotelName());
		}
	}

}
