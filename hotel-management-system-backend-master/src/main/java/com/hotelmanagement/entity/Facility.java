package com.hotelmanagement.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import org.springframework.beans.BeanUtils;
import com.hotelmanagement.dto.FacilityFetchResponse;
import lombok.Data;

@Data
@Entity
public class Facility {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	
	private String description;

	public static FacilityFetchResponse toFacilityFetchResponse(Facility facility) {
		FacilityFetchResponse facilityFetchResponse=new FacilityFetchResponse();
		BeanUtils.copyProperties(facility, facilityFetchResponse);		
		return facilityFetchResponse;
	}
	
}
