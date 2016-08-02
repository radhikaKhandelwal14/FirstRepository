package java.training.domains;

import com.training.IFaces.IDonor;

import java.util.List;

import com.training.domains.Donor;

public class DonorImpl implements IDonor {

	private List<Donor> donorList;
	@Override
	public boolean addDonor(Donor obj) {
		// TODO Auto-generated method stub
		boolean result=false;
		result=donorList.add(obj);
		return result;
		
	}

	@Override
	public boolean[] addDonor(Donor... dnrList) {
		// TODO Auto-generated method stub
		int size=dnrList.length;
		boolean result[]=new boolean[size];
		int i=0;
		for(Donor donor: dnrList){
			result[i]=donorList.add(donor);
			i++;
		}
		return result;
		return null;
	}

	@Override
	public void printDonorList() {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Project> getProjectList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addProject(Project p) {
		// TODO Auto-generated method stub

	}

}
