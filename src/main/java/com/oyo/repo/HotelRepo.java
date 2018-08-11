package com.oyo.repo;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.oyo.model.Hotel;
@Repository
public interface HotelRepo extends JpaRepository<Hotel, Integer> {

	@Transactional
	@Modifying
	@Query("delete from Hotel where email IS NULL")
	public int deleHotelEmailEmpty();

}
