package reservationproject;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat; 
public class Bookings {
	String passengerName;
	int flightNo;
	Date date;
	
	Bookings(){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name of passenger: ");
		passengerName = scanner.next();
		System.out.println("Enter flight no: ");
		flightNo = scanner.nextInt();
		System.out.println("Enter date dd-mm-yyyy");
		String dateInput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
		
		try {
			String date = dateFormat.format(dateInput);
		} catch (Exception e) {
			System.out.println();
		}
		
	}
	
	public boolean isAvailable(ArrayList<Bookings> bookings, ArrayList<Flight> flights) {
		int capacity = 0;
		for(Flight flight:flights) {
			if(flight.getFlightNo() == flightNo)
				capacity = flight.getCapacity();
		}
		
		int booked = 0;
		for(Bookings b:bookings) {
			if(b.flightNo == flightNo && b.date.equals(date)) {
				booked++;
			}
		}
		
		return booked<capacity?true:false;
		
	}
}





