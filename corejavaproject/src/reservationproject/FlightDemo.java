
package reservationproject;

import java.util.ArrayList;
import java.util.Scanner;

public class FlightDemo {

	public static void main(String[] args) {
		ArrayList<Flight> flights= new ArrayList<Flight>();
		ArrayList<Bookings> bookings=new ArrayList<Bookings>();
		flights.add(new Flight(1,true,2));
		flights.add(new Flight(2,false,5));
		flights.add(new Flight(3,true,10));
		int userOpt=1;
		Scanner scanner = new Scanner(System.in);
		for(Flight f:flights) {
			f.displayFlightInfo();
		}
		while(userOpt==1) {
			System.out.println("Enter 1 to book and 2 to exit");
			userOpt= scanner.nextInt();
			if(userOpt==1) {
				Bookings booking= new Bookings();
				if(booking.isAvailable(bookings, flights)) {
					bookings.add(booking);
					System.out.println("Your booking is confirmed");
					
				}
				else 
					System.out.println("Sorry. flight is full. Try another flight or date.");
			}
		}
		

	}

}
