package com.training.domains;

import java.util.ArrayList;

import com.training.iface.IProjectManager;

public class ProjectManager implements IProjectManager {

	ArrayList<Project> projectList;
	@Override
	/**
	 * Adding list of project
	 */
	public boolean[] addProjects(Project... pList) {
		// TODO Auto-generated method stub
		int size=pList.length;
		int i=0;
		boolean result[]=new boolean[size];
		for(Project p:pList){
			result[i]=projectList.add(p);
		}
		return result;

	}

	@Override
	public Project getProjectDetail(Project p) {
		// TODO Auto-generated method stub
	System.out.println("Amount: "+p.getAmount()+" Project code:"+p.getProjectCode()+"Project cost: "+p.getProjectCode()+"Project pending Amount"+ p.getPendingAmount());
		return null;
	}

	@Override
	public ArrayList<Project> getProjectList() {
		// TODO Auto-generated method stub
		return projectList;
	}

}
