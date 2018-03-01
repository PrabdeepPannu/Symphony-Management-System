package symphony.domain;

public class Ticket {

	
	public Ticket(){}
	
	public double getPrice(){
		return price;
	}
	
	public ID getID(){
		return id;
	} 
	
	public int getSetNumber(){
		return seatNumber;
	}
	
	public Venue getVenue(){
		return venue;
		
	}
	
	public void setPrice(double price){
		this.price=price;
	}
	
	public void setID(ID id){
		this.id=id;
	}
	
	public void setSetNumber(int seatNumber){
		this.seatNumber = seatNumber; 
	}
	
	public void setVenue(Venue venue){
		this.venue=venue;
	}
	
	
	public double price;
	public ID id;
	public int seatNumber;
	public Venue venue;
	
}
