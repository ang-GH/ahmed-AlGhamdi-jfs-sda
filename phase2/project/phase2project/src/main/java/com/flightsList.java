package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="flights")
public class flightsList {

	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	int fId ;
	
	@Column(name="airport")
	String airportName ;
	
	@Column(name="from_country")
	String from_c ;
	
	@Column(name="to_country")
	String to_c ;
	
	@Column(name="time")
	String fTime ;
	
	@Column(name="price")
	String fPrice ;

	public int getfId() {
		return fId;
	}

	public void setfId(int fId) {
		this.fId = fId;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getFrom_c() {
		return from_c;
	}

	public void setFrom_c(String from_c) {
		this.from_c = from_c;
	}

	public String getTo_c() {
		return to_c;
	}

	public void setTo_c(String to_c) {
		this.to_c = to_c;
	}

	public String getfTime() {
		return fTime;
	}

	public void setfTime(String fTime) {
		this.fTime = fTime;
	}

	public String getfPrice() {
		return fPrice;
	}

	public void setfPrice(String fPrice) {
		this.fPrice = fPrice;
	}
	
}
