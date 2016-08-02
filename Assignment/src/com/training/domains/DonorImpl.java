package com.training.domains;

import com.training.iface.*;
import java.util.ArrayList;


import java.util.List;



public class DonorImpl implements IDonor{

	private ArrayList<Donor> donorList;
	private ArrayList<Project> projectList;
	
	public DonorImpl(){
		this.donorList=new ArrayList<Donor>();
		this.projectList=new ArrayList<Project>();
	}
	@Override
	public boolean addDonor(Donor d,Project p,double amount) {
		// TODO Auto-generated method stub
		ArrayList<Donor> pList=p.getDonorList();
		boolean result=false;
		result=pList.add(d);
		p.setdonorList(pList);
		p.setAmount(amount);
		return result;
		
	}

	@Override
	public void printDonorList() {
		// TODO Auto-generated method stub
		for(Donor donor:donorList){
			System.out.println(donor);
		}
		
	}

	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		
		return projectList;
	}

	@Override
	public boolean[] addProject(Project... pList) {
		// TODO Auto-generated method stub
		int size=pList.length;
		int i=0;
		boolean result[]=new boolean[size];
		for(Project pro:pList){
			result[i]=projectList.add(pro);
		}
		return result;
	}
	
}