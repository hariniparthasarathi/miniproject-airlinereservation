package reservationproject;

public class Flight {
   private int flightNo;
   private boolean firstclass;
   private int capacity;
   
    Flight(int no,boolean firstclass,int cap){
	  this.flightNo=no;
	  this.firstclass=firstclass;
	  this.capacity=cap;
	
		

	}
public int getFlightNo() {
	return flightNo;
}
public void setFlightNo(int flightNo) {
	this.flightNo = flightNo;
}
public boolean isFirstclass() {
	return firstclass;
}
public void setFirstclass(boolean firstclass) {
	this.firstclass = firstclass;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public void displayFlightInfo() {
	System.out.println("Flight No:"+ flightNo  + "firstclass" + firstclass + "Total capacity:" +capacity);
}

}
