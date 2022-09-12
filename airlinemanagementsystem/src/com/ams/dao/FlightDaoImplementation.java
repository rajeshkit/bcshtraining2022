package com.ams.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.ams.model.Flight;

public class FlightDaoImplementation implements FlightDao{

	@Override
	public String registerFlight(Flight flight) {
		// TODO Auto-generated method stub
		String query = "INSERT INTO flight VALUES(?,?,?,?)";
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		String response=null;
		Connection connect= null;
		try {
			connect= DriverManager.getConnection(url);
			PreparedStatement pstmt=connect.prepareStatement(query);
			pstmt.setInt(1, flight.getFlightId());
			pstmt.setString(2, flight.getSource());
			pstmt.setString(3, flight.getDestination());
			pstmt.setDate(4, new Date(flight.getDepartureDate().getTime()) );
			int noOfRow = pstmt.executeUpdate();
			if(noOfRow != 0) {
				response = "Flight details registered or added";
			}
			if(noOfRow == 0) {
				response = "Flight details not registered or added";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public List<Flight> getAllFlights() {
		String url = "jdbc:derby:C:/Users/rajesh/airline";
		String query = "select * from flight";
		Connection connect=null;
		List<Flight> listofFoundFlights=new ArrayList<Flight>();
		try {
			connect= DriverManager.getConnection(url);
			Statement pstmt=connect.createStatement();
			ResultSet rs=pstmt.executeQuery(query);
			while(rs.next()) {
				Flight f=new Flight();
				f.setFlightId(rs.getInt(1));
				f.setDestination(rs.getString(3));
				f.setSource(rs.getString(2));
				f.setDepartureDate(rs.getDate(4));
				listofFoundFlights.add(f);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listofFoundFlights;
	}

	@Override
	public Flight getFlightById(Integer flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer deleteFlightById(Integer flightId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Flight updateFlightById(Flight flight) {
		// TODO Auto-generated method stub
		return null;
	}

}
