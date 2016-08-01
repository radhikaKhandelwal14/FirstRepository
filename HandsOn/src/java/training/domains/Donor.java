package java.training.domains;


public class Donor implements Comparable<Donor> {
	
	@Override
	public int compareTo(Donor obj) {
		// TODO Auto-generated method stub
		if(this.handPhone>obj.handPhone)return -1;
		if(this.handPhone<obj.handPhone)return 1;
		/*else if(this.handPhone==obj.handPhone){
			if(this.donorName.compareTo(obj.donorName)==1)
				return 1;
			else
				return -1;
		}*/
		return 0;
	}
	private long donorcode;
	private String donorName;
	private long handPhone;
	private String email;
	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Donor(long donorcode, String donorName, long handPhone, String email) {
		super();
		this.donorcode = donorcode;
		this.donorName = donorName;
		this.handPhone = handPhone;
		this.email = email;
	}
	public long getDonorcode() {
		return donorcode;
	}
	public void setDonorcode(long donorcode) {
		this.donorcode = donorcode;
	}
	public String getDonorName() {
		return donorName;
	}
	public void setDonorName(String donorName) {
		this.donorName = donorName;
	}
	public long getHandPhone() {
		return handPhone;
	}
	public void setHandPhone(long handPhone) {
		this.handPhone = handPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		StringBuffer buffer=new StringBuffer();
		buffer.append(donorcode).append(" :").append(donorName).append(" ").append(handPhone).append(" ").append(email);
		return buffer.toString();
	
	}
}
