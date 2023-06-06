package com.hotelmanagement.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.beans.BeanUtils;
import com.hotelmanagement.dto.LocationFetchResponse;

import lombok.Data;

@Entity
@Data
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String city;
	
	private String description;
	
	@OneToMany
	private List<Hotel> hotels;
	
	public static LocationFetchResponse toLocationFetchResponse(Location location) {
		LocationFetchResponse locationFetchResponse=new LocationFetchResponse();
		BeanUtils.copyProperties(location, locationFetchResponse);		
		return locationFetchResponse;
	}
	
}
