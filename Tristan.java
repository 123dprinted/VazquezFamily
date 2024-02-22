public class Tristan extends Vazquez {
	private String firstName;
	private double stupidityLevel;

	public Tristan(){
		firstName = "tristan";
		stupidityLevel = 0.0;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setName(String name){
		firstName = name;
	}

	public String getSurname(){
		return getLastName();
	}

	public double getSmart(){
		return getIntelligence();
	}

	public void bite(){
		System.out.println(firstName +" says: *bites*");
	}

	public void hello(){
		System.out.println(firstName + " says: hi my name is " + firstName + " and i am part of the vazquez class");
	}

	public void argue(Tristan otherTristan){
		System.out.println(firstName +" says *SHUT UP " + otherTristan.getFirstName() + "*");
		stupidityLevel++;
		System.out.println(firstName + "'s stupidity level increased! It is now " + stupidityLevel);
	}
}
