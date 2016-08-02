package com.training.domains;

import java.util.ArrayList;

public class ApplicationDonor {
	
	public static void main(String arg[]){
		Donor donor=new Donor(101,"rads",1233455,"rads470@gmail.com");
		Donor donor1=new Donor(102,"ram",14367,"ram@gmail.com");
		Donor donor2=new Donor(103,"raj",14367,"raj@gmail.com");
		//It is giving null pointer exception because project is not assigned
		Project project1=new Project(101,"Proj1",6788855);
		Project project2=new Project(102,"Proj2",786855);
		Project project3=new Project(103,"Proj3",889855);
		System.out.println(project1);
		ProjectManager pMgr=new ProjectManager();
		pMgr.addProjects(project1,project2,project3);
		ArrayList<Project> pList=pMgr.getProjectList();
		
		DonorImpl d=new DonorImpl();
		System.out.println("Adding Donor....."+d.addDonor(donor,project1,65776));
		d.printDonorList();
		
	}

}
