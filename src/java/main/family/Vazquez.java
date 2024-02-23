package family;

import java.lang.Math;

public class Vazquez {
	protected String lastName;
	protected double iq;

	public Vazquez(){
		lastName = "viscus";
		iq = Math.random();
	}

	public String getLastName(){
		return lastName;
	}

	public double getIntelligence(){
		return iq * 5.0;
	}
}
