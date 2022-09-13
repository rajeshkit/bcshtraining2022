package com.ams.presentation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import com.ams.bo.FlightBo;
import com.ams.bo.FlightBoImplementation;
import com.ams.model.Flight;

public class FlightMain {
	public static void main(String[] args) {
		registerFlight();
		getAllFlights();
		//deleteFlightById();
		//updateFlightByID();
	}

	private static void updateFlightByID() {
		getAllFlights();
		System.out.println("Welcome to Flight Update Process");
		Scanner s=new Scanner(System.in);
		Flight f=new Flight();
		System.out.println("Enter the Flight ID you want to update: ");
		f.setFlightId(s.nextInt());
		s.nextLine();
		System.out.println("Enter the new Flight Source to be updated: ");
		f.setSource(s.nextLine());
		System.out.println("Enter the new Flight Destination to be updated");
		f.setDestination(s.nextLine());
		System.out.println("Enter the new Departure Date(dd-MM-yyyy)to be updated");
		String date = s.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date convertedDate = null;
		try {
			convertedDate = sdf.parse(date);
		} catch (ParseException e) {
			System.out.println("The Date input format is wrong");
		}
		f.setDepartureDate(convertedDate);
		FlightBo fbo = new FlightBoImplementation();
	    Flight flight	= fbo.updateFlightById(f);
	    if(flight == null) {
	    	System.out.println("Flight details not updated");
	    }else {
	    	System.out.println(flight);
	    }
	}

	private static void deleteFlightById() {
		getAllFlights();
		Scanner s=new Scanner(System.in);
		System.out.println("Welcome to flight delete Operation");
		System.out.println("Kindly enter the flight id want to delete ");
		Integer fId = s.nextInt();
		FlightBo fbo = new FlightBoImplementation();
		int status = fbo.deleteFlightById(fId);
		if(status != 0 ) {
			System.out.println("Flight details with flight Id: "+fId+" is deleted successfully");
			getAllFlights();
		}
		if(status == 0) {
			System.out.println("Flight Id :"+fId+"  wanted to delete doesnot exists");
		}
		s.close();
	}

	private static void getAllFlights() {
		FlightBoImplementation fbo=new FlightBoImplementation();
		List<Flight> list=fbo.getAllFlights();
		if(list.isEmpty()) {
			System.out.println("No flight details available");
		}else {
			for (Flight flight : list) {
				System.out.println(flight);
			}
		}
	}

	private static void registerFlight() {
		System.out.println("Welcome to Flight Registration Process");
		Scanner s=new Scanner(System.in);
		Flight f=new Flight();
		System.out.println("Enter the Flight ID: ");
		f.setFlightId(s.nextInt());
		s.nextLine();
		System.out.println("Enter the Flight Source: ");
		f.setSource(s.nextLine());
		System.out.println("Enter the Flight Destination");
		f.setDestination(s.nextLine());
		System.out.println("Enter the Departure Date(dd-MM-yyyy)");
		String date = s.nextLine();
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-yyyy");
		Date convertedDate = null;
		try {
			convertedDate = sdf.parse(date);
		} catch (ParseException e) {
			System.out.println("The Date input format is wrong");
		}
		f.setDepartureDate(convertedDate);
		FlightBo fbo=new FlightBoImplementation();
		String status = fbo.registerFlight(f);
		System.out.println(status);
		s.close();
	}
}
