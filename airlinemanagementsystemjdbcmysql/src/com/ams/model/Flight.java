package com.ams.model;

import java.util.Date;

public class Flight {
	private Integer flightId;
	private String source;
	private String destination;
	private Date departureDate;
	public Flight() {
		// TODO Auto-generated constructor stub
	}
	public Flight(Integer flightId, String source, String destination, Date departureDate) {
		super();
		this.flightId = flightId;
		this.source = source;
		this.destination = destination;
		this.departureDate = departureDate;
	}
	public Integer getFlightId() {
		return flightId;
	}
	public void setFlightId(Integer flightId) {
		this.flightId = flightId;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public Date getDepartureDate() {
		return departureDate;
	}
	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}
	@Override
	public String toString() {
		return "flightId=" + flightId + ", source=" + source + ", destination=" + destination
				+ ", departureDate=" + departureDate + "";
	}
	
	
}
