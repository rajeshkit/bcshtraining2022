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
		//registerFlight();
		FlightBo fbo=new FlightBoImplementation();
		List<Flight> list = fbo.getAllFlights();
		for (Flight flight : list) {
			System.out.println(flight);
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
	}
}
