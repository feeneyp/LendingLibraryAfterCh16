package models;

public abstract class Material {

	private int id;
	private String title;
	private String branch;
	private Customer borrower;
	
	public Material(int id, String title, String branch) {
		this.id = id;
		this.title = title;
		this.branch = branch;
	}

	public String getTitle() {
		return title;
	}
	
	public int getID() {
		return id;
	}
	
	public void relocate (String newBranch) {
		this.branch = newBranch;
	}
	
	public String lend(Customer customer) {
		if (borrower == null) {
			borrower = customer;
			return "now loaned to " + borrower.getSurname();
		}
		else {
			return "already on loan";
		}
	}
	
	//must be overridden
	public abstract int getLoanPeriod();
	
}
