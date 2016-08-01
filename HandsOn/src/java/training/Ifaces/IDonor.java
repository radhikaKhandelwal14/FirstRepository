package java.training.Ifaces;

import java.util.List;

import java.training.domains.Donor;
import java.training.domains.Project;

public interface IDonor {
	public boolean addDonor(Donor obj);
	public boolean[] addDonor(Donor...dnrList);
	public void printDonorList();
	
	public List<Project> getProjectList();
	public void addProject(Project p);
	
	
}
