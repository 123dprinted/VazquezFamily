class TristanRunner{ 
	public static void main(String[] args){

		Tristan t = new Tristan();
		
		System.out.println(t.getFirstName() + " " + t.getSurname());
		t.bite();
		System.out.println("My intelligence is: " + t.getIntelligence());
	}
}