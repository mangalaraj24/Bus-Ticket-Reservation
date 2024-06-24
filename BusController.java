package BusTicketBookingApp;

import java.sql.SQLException;

import BusTicketBookingApp.*;


public class BusController {
	
	private Database database;
	private Bus bus;

	public BusController(Database database) {
		this.database = database;
	}
	
	public void display() throws SQLException {
		
		System.out.println(database.getAllBuses());
		
	}
	
	public void bookTicket(String no,int seatsNeeded) throws SQLException {
		if(database.availabilityChecking(no,seatsNeeded)!=null) {
			System.out.println("Booked successfully");
		}
		else {
			System.out.println("Currently no seats available");
		}
	}

}
