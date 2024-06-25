package BusTicketBookingApp;

import java.sql.SQLException;
import java.util.Scanner;

import BusTicketBookingApp.*;


public class BookingController {
	
	private Database database;
	@SuppressWarnings("unused")
	private BookingDetails bookingDetails;

	public BookingController(Database database) {
		this.database = database;
	}
	
	public void addNewPassenger(String no,int seatsNeeded) throws SQLException {
		Scanner s = new Scanner(System.in);
		if(database.availabilityChecking(no,seatsNeeded)!=null) {
		try {
			
			System.out.println("Enter Passenger Name : ");
			String passengerName = s.next();
			System.out.println("Enter the Age : ");
			int age = s.nextInt();
			System.out.println("Enter Bus Number : ");
			String busNo = s.next();
		

			if (age <= 0) {
				throw new IllegalArgumentException("Enter a valid Age");
			}
			if (passengerName.isEmpty() || busNo.isEmpty()) {
				throw new IllegalArgumentException("Enter all fields");
			}

			BookingDetails bookingDetails = new BookingDetails();
			bookingDetails.setPassenger_name(passengerName);
			bookingDetails.setAge(age);
			bookingDetails.setBusNo(busNo);
			
			

			database.addBookingDetails(bookingDetails);
			System.out.println("Passenger added successfully!");
			
		} catch (IllegalArgumentException e) {
			System.err.println("Input error: " + e.getMessage());
		} catch (Exception e) {
			System.err.println("An unexpected error occurred: " + e.getMessage());
		} finally {
			s.close();
		}
		}
		else {
			System.out.println("No seats available for booking");
		}
	}

}
