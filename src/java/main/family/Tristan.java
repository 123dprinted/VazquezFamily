package family;

public class Tristan extends Vazquez {
	private String firstName;

	public Tristan(){
		firstName = "tristan";
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

	public void bite(){
		System.out.println("Tristan says *bites*");
	}
}
