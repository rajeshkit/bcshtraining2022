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
		String url = "jdbc:mysql://localhost:3306/hsbc";
		String username = "root";
		String password = "root@123"; 
		String response=null;
		Connection connect= null;
		try {
			connect= DriverManager.getConnection(url,username,password);
			connect.setAutoCommit(false);
			PreparedStatement pstmt=connect.prepareStatement(query);
			pstmt.setInt(1, flight.getFlightId());
			pstmt.setString(2, flight.getSource());
			pstmt.setString(3, flight.getDestination());
			pstmt.setDate(4, new Date(flight.getDepartureDate().getTime()) );
			int noOfRow = pstmt.executeUpdate();
			connect.commit();
			if(noOfRow != 0) {
				response = "Flight details registered or added";
			}
			if(noOfRow == 0) {
				response = "Flight details not registered or added";
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			try {
				connect.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
		try {
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response;
	}

	@Override
	public List<Flight> getAllFlights() {
		//connect to db fire select query get resultset 
		String url = "jdbc:mysql://localhost:3306/hsbc";
		String username = "root";
		String password = "root@123"; 
		Connection connect=null;
		Statement stmt = null;
		List<Flight> list=null;
		try {
			connect = DriverManager.getConnection(url,username,password);
			stmt = connect.createStatement();
			ResultSet rs= stmt.executeQuery("select * from flight");
			list=new ArrayList<Flight>();
			while(rs.next()) {
				Flight f=new Flight();
				f.setFlightId(rs.getInt(1));
				f.setSource(rs.getString(2));
				f.setDepartureDate(rs.getDate(4));
				f.setDestination(rs.getString(3));
				list.add(f);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Flight getFlightById(Integer flightId) {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public Integer deleteFlightById(Integer flightId) {
		String url = "jdbc:mysql://localhost:3306/hsbc";
		String username = "root";
		String password = "root@123"; 
		Connection connect = null;
		PreparedStatement pstmt=null;
		int result = 0;
		try {
			connect = DriverManager.getConnection(url,username,password);
			pstmt = connect.prepareStatement("DELETE FROM flight where flight_id=?");
			pstmt.setInt(1, flightId);
			result = pstmt.executeUpdate();
			pstmt.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public Flight updateFlightById(Flight flight) {
		String url = "jdbc:mysql://localhost:3306/hsbc";
		String username = "root";
		String password = "root@123"; 
String query = 
"UPDATE flight SET flight_destination=?,flight_departure_Date=?,flight_source=? where flight_id=?";
		Connection connect = null;
		PreparedStatement pstmt=null;
		
		try {
			connect = DriverManager.getConnection(url,username,password);
			pstmt = connect.prepareStatement(query);
			pstmt.setString(1, flight.getSource());
			pstmt.setDate(2, new Date(flight.getDepartureDate().getTime()));
			pstmt.setString(3, flight.getDestination());
			pstmt.setInt(4, flight.getFlightId());
			
			int result = pstmt.executeUpdate();
			if(result==0) {
				return null;
			}
			pstmt.close();
			connect.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flight;
	}

}
