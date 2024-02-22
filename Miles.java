public class Miles extends Vazquez {
	private String firstName;

	public Miles() {
		firstName = "miles";
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurname(){
		return getLastName();
	}

	public double getSmart(){
		return getIntelligence();
	}

	public void holdThis(){
		System.out.println("miles says can you hold this for me");
	}
	
}
