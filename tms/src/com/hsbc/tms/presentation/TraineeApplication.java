package com.hsbc.tms.presentation;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import com.hsbc.tms.bo.TraineeBo;
import com.hsbc.tms.bo.TraineeBoImplementation;
import com.hsbc.tms.model.Trainee;

public class TraineeApplication {
	
	public static void main(String[] args) throws IOException{
		//registerTrainee();
		TraineeBo tbo=new TraineeBoImplementation();
		
		List<Trainee> list=tbo.getAllTrainees();// calling
		
		for (Trainee trainee : list) {
			System.out.println(trainee.toString());
//			System.out.println(trainee.getBatchId());
//			System.out.println(trainee.getTraineeName());
//			System.out.println(trainee.getBatchId());
//			System.out.println(trainee.getSalary());
//			System.out.println(trainee.getTechnology());
			System.out.println("******************************");
		}
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void registerTrainee() {
		Trainee t=new Trainee();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the trainee ID:");
		t.setTraineeId(s.nextInt());
		System.out.println("Enter the Salary:");
		t.setSalary(s.nextLong());
		s.nextLine();
		System.out.println("Enter the trainee Name:");
		t.setTraineeName(s.nextLine());
		System.out.println("Enter the Batch ID:");
		t.setBatchId(s.nextLine());
		System.out.println("Enter the Technology");
		t.setTechnology(s.nextLine());
		TraineeBo tbo=new TraineeBoImplementation();
		tbo.createTrainee(t);
		s.close();
	}
}
