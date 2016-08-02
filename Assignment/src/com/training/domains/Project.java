package com.training.domains;

import java.util.ArrayList;

import com.training.domains.Donor;

public class Project {
private ArrayList<Donor> donorList;
private int projectCode;
private double amount;
private double cost;

public Project(){
	this.donorList=new ArrayList<Donor>();
	amount=0.0;
}
public Project(int projectCode, double cost) {
	super();
	this.projectCode = projectCode;
	this.cost = cost;
}
public double getCost() {
	return cost;
}

public void setCost(double cost) {
	this.cost = cost;
}

public double getPendingAmount() {
	return pendingAmount;
}

public void setPendingAmount() {
	this.pendingAmount = cost-amount;
}
private double pendingAmount;
public int getProjectCode() {
	return projectCode;
}

public void setProjectCode(int projectCode) {
	this.projectCode = projectCode;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}



public ArrayList<Donor> getDonorList() {
	return donorList;
}
public void setdonorList(ArrayList<Donor> donorList) {
	this.donorList = donorList;
}






}
