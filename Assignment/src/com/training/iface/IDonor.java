package com.training.iface;

import java.util.List;

import com.training.domains.Donor;
import com.training.domains.Project;

public interface IDonor {
	
	public boolean addDonor(Donor d,Project p,double amount);
	public void printDonorList();
	
	public List<Project> getProjectList();
	public boolean[] addProject(Project...p);
	
	
}