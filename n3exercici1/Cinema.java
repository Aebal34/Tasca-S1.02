package n3exercici1;

public class Cinema {

	//ATTRIBUTES
	private int numOfRows;
	private int seatsPerRow;
	private SeatManager seatManager;
	
	//CONSTRUCTOR
	public Cinema() {
		seatManager = new SeatManager();
		askInitialData();
	}
	
	//INTERFACE
	public byte menu() {
		return Input.readByte("1. Show all reserved seats."+"\n"
					  		 +"2. Show reserved seats for a certain person."+"\n"
					  		 +"3. Reserve seat."+"\n"
					  		 +"4. Cancel reservation of a seat."+"\n"
					  		 +"5. Cancel all reservations of a certain person."+"\n"
					  		 +"0. Exit");
	}
	
	//SHOW DATA
	public void showReservedSeats() {
		for(Seat seat :seatManager.getSeats()) {
			System.out.println(seat);
		}
	}
	
	public void showReservedSeatsByPerson(String person) {
		for(Seat seat :seatManager.getSeats()) {
			if(seat.getPerson().equals(person)) {
				System.out.println(seat);
			}
		}
	}
	
	
	//INSERT DATA
	public void askInitialData() {
		numOfRows = Input.readInt("How many rows does the cinema has?");
		seatsPerRow = Input.readInt("How many seats does each row has?");
	}
	
	public int insertRow() throws IncorrectRowException {
		int row = Input.readInt("Insert row number:");
		if (row < 1 || row > numOfRows) {
			throw new IncorrectRowException("Inserted row does not exist.");
		}
		return row;
	}
	
	public int insertSeatNumber() throws IncorrectSeatNumberException{
		int seatNumber = Input.readInt("Insert seat number:");
		if (seatNumber < 1 || seatNumber > seatsPerRow) {
			throw new IncorrectSeatNumberException("Inserted seat does not exist.");
		}
		return seatNumber;
	}
	
	public String insertPerson() throws IncorrectPersonNameException{
		String person = Input.readString("Insert the person's name:");
		if(person.matches(".*\\d+.*")) {
			throw new IncorrectPersonNameException("Inserted name has numbers in it.");
		}
		return person;
	}
	
	//DATA CONTROL
	public void reserveSeat() {
		try {
			seatManager.addSeat(new Seat(insertRow(), insertSeatNumber(), insertPerson()));
		} catch (OccupiedSeatException | IncorrectRowException | IncorrectSeatNumberException
				| IncorrectPersonNameException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void removeReservedSeat() {
		try {
			seatManager.removeSeat(insertRow(), insertSeatNumber());
		} catch (EmptySeatException | IncorrectRowException | IncorrectSeatNumberException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void removeReservedSeatsOfPerson() {
		for(int i=0; i<seatManager.getSeats().size(); i++) {
			try {
				if(seatManager.getSeats().get(i).getPerson().equals(insertPerson())) {
					seatManager.getSeats().remove(i);
				}
			} catch (IncorrectPersonNameException e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	//RUN
	public void start() {
		boolean flag = true;
		while(flag) {
			switch(menu()) {
				case 1:
					showReservedSeats();
					break;
				case 2:
				try {
					showReservedSeatsByPerson((insertPerson()));
				} catch (IncorrectPersonNameException e) {
					System.out.println(e.getMessage());
				}
					break;
				case 3:
					reserveSeat();
					break;
				case 4:
					removeReservedSeat();
					break;
				case 5:
					removeReservedSeatsOfPerson();
					break;
				case 0:
					System.out.println("Have a nice day.");
					flag = false;
					break;
				default:
					System.out.println("Please, select a valid option.");
					break;
			}
		}
	}
}
