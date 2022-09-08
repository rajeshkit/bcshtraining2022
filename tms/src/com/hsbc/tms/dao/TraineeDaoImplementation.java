package com.hsbc.tms.dao;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.postgresql.xml.NullErrorHandler;

import com.hsbc.tms.model.Trainee;

public class TraineeDaoImplementation implements TraineeDao{

	@Override
	public void registerTrainee(Trainee tr) {
		//here have to write a code to connect db and store 
		// trainee object into the db
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "root1234";
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			int no = stmt.executeUpdate(
					"insert into trainee values(" + tr.getTraineeId() + ",'" + tr.getTraineeName() + "','" + tr.getBatchId() + "'," + tr.getSalary() + ",'" + tr.getTechnology()+ "')");
			System.out.println("Insert is done" + no);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public List<Trainee> fetchAllTrainee() throws IOException{
		// connect to the db get all trainees from the database
		String url = "jdbc:postgresql://localhost:5432/postgres";
		String user = "postgres";
		String password = "root1234";
		List<Trainee> traineeList=new ArrayList<>();
		try {
			Class.forName("org.postgresql.Driver");
			Connection con = DriverManager.getConnection(url, user, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from trainee");
			
			while (rs.next()) {// true
				Trainee t=new Trainee();
				t.setTraineeId(rs.getInt("id"));
				t.setTraineeName(rs.getString("name"));
				t.setBatchId(rs.getString("batch"));
				t.setSalary(rs.getLong("salary"));
				t.setTechnology(rs.getString(5));
				traineeList.add(t);
			}

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(traineeList.size()==0) {
			throw new IOException();
		}
		return traineeList;
	}

	
	
	
	
}
