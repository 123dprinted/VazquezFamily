import family.Miles;
import family.Tristan;

public class TristanRunner{ 
	public static void main(String[] args){

		Tristan t = new Tristan();
		Miles m = new Miles();

		System.out.println(t.getFirstName() + " " + t.getSurname());
		t.bite();
		System.out.println("My intelligence is: " + t.getIntelligence());

		System.out.println(m.getFirstName() + " " + m.getSurname());
		System.out.println("My intelligence is: " + m.getIntelligence());
		m.holdThis();
	}
}