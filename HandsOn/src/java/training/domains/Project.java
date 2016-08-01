package java.training.domains;

import java.util.ArrayList;

public class Project {
private ArrayList<Donor> donorList;
private int projectCode;
private double amount;
private double cost;
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

public Project() {
	super();
	// TODO Auto-generated constructor stub
	amount=0.0;
}

public ArrayList<Donor> getDonorList() {
	return donorList;
}
public void setdonorList(ArrayList<Donor> donorList) {
	this.donorList = donorList;
}






}
