package br.cefsa.ftt.ec;

public class Startup {

	//permalink,company,numEmps,category,city,state,fundedDate,raisedAmt,raisedCurrency,round	
	
	String permaLink,
		   company;
	int numEmps;
	String category,
	       city,
	       state,
	       fundedDate;
	float raisedAmt;
	String raisedCurrency,
	       round;
	
	public Startup() {
		super();
	} //Default constructor
	
	public Startup(String registro[]) {
		//System.out.println(registro);
		
		this.setPermaLink(registro[0]);
		this.setCompany(registro[1]);
		this.setNumEmps(registro[2]);
		this.setCategory(registro[3]);
		this.setCity(registro[4]);
		this.setState(registro[5]);
		this.setFundedDate(registro[6]);
		this.setRaisedAmt(registro[7]);
		this.setRaisedCurrency(registro[8]);
		this.setRound(registro[9]);
		
	} //Startup String[] constructor
	
	public String toString() {
		return this.getCompany();
	}
	
	public String getPermaLink() {
		return permaLink;
	}
	public void setPermaLink(String permaLink) {
		this.permaLink = permaLink;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getNumEmps() {
		return numEmps;
	}
	public void setNumEmps(String numEmps) {
		
		if (numEmps.equals(""))
			this.numEmps = 0;
		else
			this.setNumEmps(Integer.valueOf(numEmps));
		
	}
	public void setNumEmps(int numEmps) {
		this.numEmps = numEmps;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFundedDate() {
		return fundedDate;
	}
	public void setFundedDate(String fundedDate) {
		this.fundedDate = fundedDate;
	}
	public float getRaisedAmt() {
		return raisedAmt;
	}
	public void setRaisedAmt(String raisedAmt) {
		if (raisedAmt.equals(""))
			this.raisedAmt = 0;
		else
			this.setRaisedAmt(Float.valueOf(raisedAmt));
	}
	public void setRaisedAmt(float raisedAmt) {
		this.raisedAmt = raisedAmt;
	}
	public String getRaisedCurrency() {
		return raisedCurrency;
	}
	public void setRaisedCurrency(String raisedCurrency) {
		this.raisedCurrency = raisedCurrency;
	}
	public String getRound() {
		return round;
	}
	public void setRound(String round) {
		this.round = round;
	}
		   	
} //Startup