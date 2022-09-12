package com.ams.bo;

import java.util.List;

import com.ams.model.Flight;

public interface FlightBo {
	public String registerFlight(Flight flight);
	public List<Flight> getAllFlights();
	public Flight getFlightById(Integer flightId);
	public Integer deleteFlightById(Integer flightId);
	public Flight updateFlightById(Flight flight);
}
