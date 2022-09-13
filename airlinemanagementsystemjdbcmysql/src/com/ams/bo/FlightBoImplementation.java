package com.ams.bo;

import java.util.List;

import com.ams.dao.FlightDao;
import com.ams.dao.FlightDaoImplementation;
import com.ams.model.Flight;

public class FlightBoImplementation implements FlightBo {

	@Override
	public String registerFlight(Flight flight) {
		FlightDao fdao=new FlightDaoImplementation();
		String result = fdao.registerFlight(flight);
		return result;
	}

	@Override
	public List<Flight> getAllFlights() {
		FlightDao fdao=new FlightDaoImplementation();
		List<Flight> list=fdao.getAllFlights();
		return list;
	}

	@Override
	public Flight getFlightById(Integer flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteFlightById(Integer flightId) {
		// TODO Auto-generated method stub
		FlightDao fdao = new FlightDaoImplementation();
		int answer = fdao.deleteFlightById(flightId);
		return answer;
	}

	@Override
	public Flight updateFlightById(Flight flight) {
		// TODO Auto-generated method stub
		FlightDao fdao = new FlightDaoImplementation();
		Flight f = fdao.updateFlightById(flight);
		return f;
	}

}
