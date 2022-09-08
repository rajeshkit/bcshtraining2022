package com.hsbc.tms.dao;

import java.io.IOException;
import java.util.List;

import com.hsbc.tms.model.Trainee;

public interface TraineeDao {
	public void registerTrainee(Trainee t);
	public List<Trainee> fetchAllTrainee() throws IOException;
}
