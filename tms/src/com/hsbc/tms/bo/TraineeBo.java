package com.hsbc.tms.bo;

import java.io.IOException;
import java.util.List;

import com.hsbc.tms.model.Trainee;

public interface TraineeBo {
	public void createTrainee(Trainee trainee);
	public List<Trainee> getAllTrainees() throws IOException;
}
