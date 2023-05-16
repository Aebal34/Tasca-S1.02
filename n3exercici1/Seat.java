package n3exercici1;

public class Seat {

	//ATTRIBUTES
	private int row;
	private int seat;
	private String person;
	
	//CONSTRUCTOR
	public Seat(int row, int seat, String person) {
		
		this.row=row;
		this.seat=seat;
		this.person=person;
	}
	
	//GETTERS
	public int getRow() {
		return row;
	}
	public int getSeat() {
		return seat;
	}
	public String getPerson() {
		return person;
	}
	
	//METHODS
	
	public boolean equals() {
		return row == seat;
	}

	@Override
	public String toString() {
		return "Row: "+row+", Seat: "+seat+", Person: "+person;
	}
	
	
	
}
