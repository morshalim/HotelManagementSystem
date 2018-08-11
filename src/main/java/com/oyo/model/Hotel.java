package com.oyo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.springframework.boot.actuate.audit.listener.AuditListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@EntityListeners(AuditListener.class)
@Entity
//@NamedQuery(query = "select u from hotel u", name = "query_find_all_Hotels")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class Hotel {
	
	
	//@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	@Column(name = "Id", nullable = false)
	Integer hotelId;
	
	/*@NotNull*/
	@Column(name = "hotelName", nullable = false)
	String hotelName;
	
	@Column(name = "mobno", nullable = false)
	long mobno;
	
	@Column(name = "email", nullable = true)
	String email;
	
	@Column(name = "pinCode", nullable = false)
	long pinCode;
	
	@Column(name = "addr", nullable = false)
	String addr;
	
	public Integer getHotelId() {
		return hotelId;
	}
	public void setHotelId(Integer hotelId) {
		this.hotelId = hotelId;
	}
	public String getHotelName() {
		return hotelName;
	}
	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}
	public long getMobno() {
		return mobno;
	}
	public void setMobno(long i) {
		this.mobno = i;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	@Override
	public String toString() {
	 return String.format("Hotel [id=%s, name=%s, ]", hotelId, hotelName);
	}

}
