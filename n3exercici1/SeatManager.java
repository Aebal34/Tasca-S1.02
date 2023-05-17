package n3exercici1;

import java.util.ArrayList;

public class SeatManager {

	//ATTRIBUTES
	private ArrayList<Seat> seats;
	
	//CONSTRUCTOR
	public SeatManager() {
		seats = new ArrayList<Seat>();
	}
	
	//GETTERS
	public ArrayList<Seat> getSeats(){
		return seats;
	}
	
	//METHODS
	public void addSeat(Seat seat) throws OccupiedSeatException {

		try { 
			if(seat.equals(seats.get(searchSeat(seat.getRow(), seat.getSeat())))) {
				throw new OccupiedSeatException("The seat is occupied. Cannot be added.");
			}
		}catch(IndexOutOfBoundsException e) { //If searchSeat returns -1 (seat not found)
			seats.add(seat);
			System.out.println("The seat has been added properly.");
		}
	}
	
	public void removeSeat(int row, int seat) throws EmptySeatException{
		
		try {
			seats.remove(searchSeat(row, seat));
			System.out.println("The seat row "+row+" and number "+seat+" have been correctly removed.");
		}catch(IndexOutOfBoundsException e) { //If searchSeat returns -1 (seat not found)
			throw new EmptySeatException("The seat is empty. Cannot be removed.");
		}
	}
	
	public int searchSeat(int row, int seat) {
		
		boolean flag = false;
		int index = -1;
		int counter = 0;
		try {
			while(!flag && counter < seats.size()){
				if(row == seats.get(counter).getRow() && seat == seats.get(counter).getSeat()) {
					index = counter;
					flag = true;
				}else {
					counter++;
				}
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("You must add a seat first to search one");
		}
		return index; //If seat not found, return -1
	}
}
