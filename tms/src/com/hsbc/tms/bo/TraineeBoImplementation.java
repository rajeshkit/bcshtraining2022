package com.hsbc.tms.bo;

import java.io.IOException;
import java.util.List;

import com.hsbc.tms.dao.TraineeDao;
import com.hsbc.tms.dao.TraineeDaoImplementation;
import com.hsbc.tms.model.Trainee;

public class TraineeBoImplementation implements TraineeBo{

	@Override
	public void createTrainee(Trainee trainee) {
		System.out.println(trainee.getTraineeId()+" "+trainee.getTraineeName());
		TraineeDao tdao=new TraineeDaoImplementation();
		tdao.registerTrainee(trainee);
	}

	@Override
	public List<Trainee> getAllTrainees() throws IOException {
		TraineeDao tdao=new TraineeDaoImplementation();
	
		List<Trainee> traineeList1 = tdao.fetchAllTrainee();// calling
		
		return traineeList1;
	}

}
