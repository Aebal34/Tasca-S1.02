package n3exercici1;

import java.util.ArrayList;

public class SeatManager {

	//ATTRIBUTES
	ArrayList<Seat> seats;
	
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
		}
	}
	
	public void removeSeat(int row, int seat) throws EmptySeatException{
		
		try {
			Seat seatToRemove = seats.get(searchSeat(row, seat));
			seats.remove(searchSeat(row, seat));
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
				}
			}
		}catch(IndexOutOfBoundsException e) {
			System.out.println("You must add a seat first to search one");
		}
		return index; //If seat not found, return -1
	}
}
